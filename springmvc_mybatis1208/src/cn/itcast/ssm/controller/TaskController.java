package cn.itcast.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import cn.itcast.ssm.po.TaskExtend;
import cn.itcast.ssm.po.TaskExtend;
import cn.itcast.ssm.po.TaskQueryPo;
import cn.itcast.ssm.po.TaskQueryResultPo;
import cn.itcast.ssm.service.TaskService;

@Controller
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@RequestMapping("/task")
    public void task(Model model, TaskQueryPo taskQueryPo) throws Exception {		
		taskQueryPo.setIndex(taskQueryPo.getPage()*taskQueryPo.getRows());
		int total=taskService.findTaskByQueryPo(taskQueryPo).size();
    	List<TaskExtend> taskExtends = taskService.findTaskByQueryPo(taskQueryPo);
    	TaskQueryResultPo taskQueryResultPo=new TaskQueryResultPo(total,taskExtends);  	
        model.addAttribute("total", total);
        model.addAttribute("rows", taskQueryResultPo.getTasks());
	}
	@ResponseBody 
	@RequestMapping("/pageList")
    public Map pageList(Model model, TaskQueryPo taskQueryPo) throws Exception {
		taskQueryPo.setIndex((taskQueryPo.getPage()-1)*taskQueryPo.getRows());
		//int total=taskService.findTaskByQueryPo(taskQueryPo).size();
		int total=taskService.findAllTaskByQueryPo(taskQueryPo).size();
    	List<TaskExtend> taskExtends = taskService.findTaskByQueryPo(taskQueryPo);
    	TaskQueryResultPo taskQueryResultPo=new TaskQueryResultPo(total,taskExtends);  	
        model.addAttribute("total", taskQueryResultPo.getCount());
        model.addAttribute("rows", taskQueryResultPo.getTasks());
        Map params = new HashMap();  
		params.put("rows",  taskQueryResultPo.getTasks());  
		params.put("total", taskQueryResultPo.getCount());  
		//ResponseUtil.sendJsonNoCache(response, result.toJSONString());  
		return params;
    }

	// 查询
	@RequestMapping("/queryTask")
	public ModelAndView queryTask(HttpServletRequest request) throws Exception {
		// 测试forward后request是否可以共享
		// System.out.println(request.getParameter("id"));
		// 调用service查找 数据库，查询商品列表
		List<TaskExtend> taskList = taskService.findAllTask();
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中�?过TaskList取数�?
		modelAndView.addObject("taskList", taskList);
		// 指定视图
		// 下边的路径，如果在视图解析器中配置jsp路径的前�?��jsp路径的后�?��修改�?
		// modelAndView.setViewName("/WEB-INF/jsp/Task/TaskList.jsp");
		// 上边的路径配置可以不在程序中指定jsp路径的前缀jsp路径的后�?
		modelAndView.setViewName("task/task");
		return modelAndView;
	}

	// 更改
	@RequestMapping(value = "/editTask", method = { RequestMethod.POST,
			RequestMethod.GET })
	// @RequestParam里边指定request传入参数名称和形参进行绑定。
	// 通过required属性指定参数是否必须要传入
	// 通过defaultValue可以设置默认值，如果id参数没有传入，将默认值和形参绑定。
	public String editTask(Model model, @RequestParam("taskid") Integer taskid)
			throws Exception {
		// 调用service根据商品id查询商品信息
		TaskExtend taskExtend = taskService.findTaskByTaskId(taskid);
		// 通过形参中的model将model数据传到页面
		// 相当于modelAndView.addObject方法
		model.addAttribute("taskExtend", taskExtend);
		return "task/editTask";
	}

	// 更改
	@RequestMapping("/editTaskSubmit")
	public String editTaskSubmit(HttpServletRequest request, Integer taskid,
			TaskExtend taskExtend) throws Exception {
		taskService.updateTask(taskExtend);
		return "task/task";
	}

	// 删除
	@RequestMapping("/deleteTask")
	public String deleteTask(@RequestParam("taskid") Integer taskid) throws Exception {
		taskService.deleteTask(taskid);
		return "task/task";
	}
	public void deleteBatchTasks1(String ids) throws Exception {
		String[] taskids = ids.split(",");
		System.out.println(taskids.length);
		for(int i=0;i<taskids.length;i++){
			System.out.println(taskids[i]);
		}
		taskService.deleteBatchTasks(taskids);
		//return "task/task";
	}
	@RequestMapping("/deleteBatchTasks")
	public String deleteBatchTasks(@RequestParam("ids") String ids) throws Exception {
		String[] taskids = ids.split(",");
		taskService.deleteBatchTasks(taskids);
		return "task/task";
	}
//	// 添加用户
//	@RequestMapping("/addTask1")
//	public String addTask1(ModelMap map) throws Exception {
//		TaskExtend taskExtend = new TaskExtend();
//		taskExtend.setTaskname("aa");
//		taskExtend.setPassword("123456");
//		taskExtend.setRole(1);
//		map.addAttribute("task", taskExtend);
//		taskService.addTask(taskExtend);
//		return "task/addTask1";
//
//	}
	@RequestMapping("/addTask")
	public void addTask(ModelMap map,TaskExtend taskExtend) throws Exception {
//		TaskExtend taskExtend = new TaskExtend();
//		taskExtend.setTaskname("aa");
//		taskExtend.setPassword("123456");
//		taskExtend.setRole(1);
		map.addAttribute("task", taskExtend);
		taskService.addTask(taskExtend);
		//return "task/addTask1";

	}
	@RequestMapping("/result")
	public String result(ModelMap map, @RequestParam String taskname,
			@RequestParam String password, @RequestParam Integer role,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		map.addAttribute("taskname", taskname);
		map.addAttribute("password", password);
		map.addAttribute("role", role);
		TaskExtend taskExtend = new TaskExtend();
//		taskExtend.settaskname(taskname);
		taskService.addTask(taskExtend);
		return "task/task";
	}
	

}
