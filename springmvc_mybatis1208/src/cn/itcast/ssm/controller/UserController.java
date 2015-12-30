package cn.itcast.ssm.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import cn.itcast.ssm.po.UserExtend;
import cn.itcast.ssm.po.UserExtend;
import cn.itcast.ssm.po.UserQueryPo;
import cn.itcast.ssm.po.UserQueryResultPo;
import cn.itcast.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/user")
    public void user(Model model, UserQueryPo userQueryPo) throws Exception {		
		userQueryPo.setIndex(userQueryPo.getPage()*userQueryPo.getRows());
		int total=userService.findUserByQueryPo(userQueryPo).size();
    	List<UserExtend> userExtends = userService.findUserByQueryPo(userQueryPo);
    	UserQueryResultPo userQueryResultPo=new UserQueryResultPo(total,userExtends);  	
        model.addAttribute("total", total);
        model.addAttribute("rows", userQueryResultPo.getUsers());
	}
	@ResponseBody 
	@RequestMapping("/pageList")
    public Map pageList(Model model, UserQueryPo userQueryPo) throws Exception {
		userQueryPo.setIndex((userQueryPo.getPage()-1)*userQueryPo.getRows());
		//int total=userService.findUserByQueryPo(userQueryPo).size();
		int total=userService.findAllUserByQueryPo(userQueryPo).size();
    	List<UserExtend> userExtends = userService.findUserByQueryPo(userQueryPo);
    	UserQueryResultPo userQueryResultPo=new UserQueryResultPo(total,userExtends);  	
        model.addAttribute("total", userQueryResultPo.getCount());
        model.addAttribute("rows", userQueryResultPo.getUsers());
        Map params = new HashMap();  
		params.put("rows",  userQueryResultPo.getUsers());  
		params.put("total", userQueryResultPo.getCount());  
		//ResponseUtil.sendJsonNoCache(response, result.toJSONString());  
		return params;
    }
	
	@ResponseBody 
	@RequestMapping(value="/verifyUser", method = RequestMethod.POST)
	public Integer verifyUser(UserExtend userExtend) throws Exception{
		Integer result=userService.verifyLogin(userExtend);
		return result;
	}
	
@ResponseBody 
	@RequestMapping(value="/ifUserExist", method = RequestMethod.POST)
	public Integer ifUserExist(UserExtend userExtend) throws Exception{
		return userService.ifUserExist(userExtend);
	}

@ResponseBody 
	@RequestMapping(value="/registerUser", method = RequestMethod.POST)
	public Integer registerUser(UserExtend userExtend) throws Exception{
		return userService.registerUser(userExtend);
	}
	
	// 查询
	@RequestMapping("/queryUser")
	public ModelAndView queryUser(HttpServletRequest request) throws Exception {
		// 测试forward后request是否可以共享
		// System.out.println(request.getParameter("id"));
		// 调用service查找 数据库，查询商品列表
		List<UserExtend> userList = userService.findAllUser();
		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中�?过UserList取数�?
		modelAndView.addObject("userList", userList);
		// 指定视图
		// 下边的路径，如果在视图解析器中配置jsp路径的前�?��jsp路径的后�?��修改�?
		// modelAndView.setViewName("/WEB-INF/jsp/User/UserList.jsp");
		// 上边的路径配置可以不在程序中指定jsp路径的前缀jsp路径的后�?
		modelAndView.setViewName("user/user");
		return modelAndView;
	}

	// 更改
	@RequestMapping(value = "/editUser", method = { RequestMethod.POST,
			RequestMethod.GET })
	// @RequestParam里边指定request传入参数名称和形参进行绑定。
	// 通过required属性指定参数是否必须要传入
	// 通过defaultValue可以设置默认值，如果id参数没有传入，将默认值和形参绑定。
	public String editUser(Model model, @RequestParam("userid") Integer userid)
			throws Exception {
		// 调用service根据商品id查询商品信息
		UserExtend userExtend = userService.findUserByUserId(userid);
		// 通过形参中的model将model数据传到页面
		// 相当于modelAndView.addObject方法
		model.addAttribute("userExtend", userExtend);
		return "user/editUser";
	}

	// 更改
	@RequestMapping("/editUserSubmit")
	public String editUserSubmit(HttpServletRequest request, Integer userid,
			UserExtend userExtend) throws Exception {
		userService.updateUser(userExtend);
		return "user/user";
	}

	// 删除
	@RequestMapping("/deleteUser")
	public String deleteUser(@RequestParam("userid") Integer userid) throws Exception {
		userService.deleteUser(userid);
		return "user/user";
	}
	public void deleteBatchUsers1(String ids) throws Exception {
		String[] userids = ids.split(",");
		System.out.println(userids.length);
		for(int i=0;i<userids.length;i++){
			System.out.println(userids[i]);
		}
		userService.deleteBatchUsers(userids);
		//return "user/user";
	}
	@RequestMapping("/deleteBatchUsers")
	public String deleteBatchUsers(@RequestParam("ids") String ids) throws Exception {
		String[] userids = ids.split(",");
		userService.deleteBatchUsers(userids);
		return "user/user";
	}
//	// 添加用户
//	@RequestMapping("/addUser1")
//	public String addUser1(ModelMap map) throws Exception {
//		UserExtend userExtend = new UserExtend();
//		userExtend.setUsername("aa");
//		userExtend.setPassword("123456");
//		userExtend.setRole(1);
//		map.addAttribute("user", userExtend);
//		userService.addUser(userExtend);
//		return "user/addUser1";
//
//	}
	@RequestMapping("/addUser")
	public void addUser(ModelMap map,UserExtend userExtend) throws Exception {
//		UserExtend userExtend = new UserExtend();
//		userExtend.setUsername("aa");
//		userExtend.setPassword("123456");
//		userExtend.setRole(1);
		map.addAttribute("user", userExtend);
		userService.addUser(userExtend);
		//return "user/addUser1";

	}
	@RequestMapping("/result")
	public String result(ModelMap map, @RequestParam String username,
			@RequestParam String password, @RequestParam Integer role,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		map.addAttribute("username", username);
		map.addAttribute("password", password);
		map.addAttribute("role", role);
		UserExtend userExtend = new UserExtend();
		userExtend.setUsername(username);
		userExtend.setPassword(password);
		userExtend.setRole(role);
		userService.addUser(userExtend);
		return "user/user";
	}
	

}
