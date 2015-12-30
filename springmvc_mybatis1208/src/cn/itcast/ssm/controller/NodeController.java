package cn.itcast.ssm.controller;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
import cn.itcast.ssm.po.NodeExtend;
import cn.itcast.ssm.po.NodeQueryPo;
import cn.itcast.ssm.po.NodeQueryResultPo;
import cn.itcast.ssm.po.NodeQueryVo;
import cn.itcast.ssm.po.UserExtend;
import cn.itcast.ssm.po.UserQueryPo;
import cn.itcast.ssm.po.UserQueryResultPo;
import cn.itcast.ssm.service.NodeService;
import cn.itcast.ssm.service.NodeService;

@Controller
// 为了对url进行分类管理 ，可以在这里定义根路径，�?��访问url是根路径+子路�?
// 比如：商品列表：/Node/queryNode.action
@RequestMapping("/node")
public class NodeController {

	@Autowired
	private NodeService nodeService;

	@RequestMapping("/node")
    public void node(Model model, NodeQueryPo nodeQueryPo) throws Exception {		
		nodeQueryPo.setIndex(nodeQueryPo.getPage()*nodeQueryPo.getRows());
		int total=nodeService.findNodeByQueryPo(nodeQueryPo).size();
    	List<NodeExtend> nodeExtends = nodeService.findNodeByQueryPo(nodeQueryPo);
    	NodeQueryResultPo nodeQueryResultPo=new NodeQueryResultPo(total,nodeExtends);  	
        model.addAttribute("total", total);
        model.addAttribute("rows", nodeQueryResultPo.getNodes());
	}
	@ResponseBody 
	@RequestMapping("/pageList")
    public Map pageList(Model model, NodeQueryPo nodeQueryPo) throws Exception {
		nodeQueryPo.setIndex((nodeQueryPo.getPage()-1)*nodeQueryPo.getRows());
		//int total=nodeService.findNodeByQueryPo(nodeQueryPo).size();
		int total=nodeService.findAllNodeByQueryPo(nodeQueryPo).size();
    	List<NodeExtend> nodeExtends = nodeService.findNodeByQueryPo(nodeQueryPo);
    	NodeQueryResultPo nodeQueryResultPo=new NodeQueryResultPo(total,nodeExtends);  	
        model.addAttribute("total", nodeQueryResultPo.getCount());
        model.addAttribute("rows", nodeQueryResultPo.getNodes());
        Map params = new HashMap();  
		params.put("rows",  nodeQueryResultPo.getNodes());  
		params.put("total", nodeQueryResultPo.getCount());  
		//ResponseUtil.sendJsonNoCache(response, result.toJSONString());  
		return params;
    }
	// 节点查询
	@RequestMapping("/queryNode")
	public ModelAndView queryNode(HttpServletRequest request) throws Exception {
		// 测试forward后request是否可以共享

		System.out.println(request.getParameter("id"));

		// 调用service查找 数据库，查询商品列表
		List<NodeExtend> nodeList = nodeService.findNode();

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中�?过NodeList取数�?
		modelAndView.addObject("nodeList", nodeList);

		// 指定视图
		// 下边的路径，如果在视图解析器中配置jsp路径的前�?��jsp路径的后�?��修改�?
		// modelAndView.setViewName("/WEB-INF/jsp/Node/NodeList.jsp");
		// 上边的路径配置可以不在程序中指定jsp路径的前缀jsp路径的后�?
		modelAndView.setViewName("node/nodeList");

		return modelAndView;

	}


	// 更改
		@RequestMapping(value = "/editNode", method = { RequestMethod.POST,
				RequestMethod.GET })
		// @RequestParam里边指定request传入参数名称和形参进行绑定。
		// 通过required属性指定参数是否必须要传入
		// 通过defaultValue可以设置默认值，如果id参数没有传入，将默认值和形参绑定。
		public String editNode(Model model, @RequestParam("userid") Integer userid)
				throws Exception {
			// 调用service根据商品id查询商品信息
			NodeExtend nodeExtend = nodeService.findNodeByUserId(userid);
			// 通过形参中的model将model数据传到页面
			// 相当于modelAndView.addObject方法
			model.addAttribute("nodeExtend", nodeExtend);
			return "node/editNode";
		}

//	@RequestMapping(value = "/editNode", method = { RequestMethod.POST,
//			RequestMethod.GET })
//	// @RequestParam里边指定request传入参数名称和形参进行绑定�?
//	// 通过required属�?指定参数是否必须要传�?
//	// 通过defaultValue可以设置默认值，如果id参数没有传入，将默认值和形参绑定�?
//	public String editNode(Model model,
//			@RequestParam(value = "id", required = true) Integer Node_id)
//			throws Exception {
//
//		// 调用service根据商品id查询商品信息
//		List<NodeExtend> NodeList = NodeService.findAllNode();
//		//判断商品是否为空，根据id没有查询到商品，抛出异常，提示用户商品信息不�?�?
////		if(NodeCustom == null){
////			throw new CustomException("修改的商品信息不存在!");
////		}
//
//		// 通过形参中的model将model数据传到页面
//		// 相当于modelAndView.addObject方法
//		model.addAttribute("Node", NodeCustom);
//
//		return "Node/editNode";
//	}
//	
//	//查询商品信息，输出json
//	///NodeView/{id}里边的{id}表示占位符，通过@PathVariable获取占位符中的参数，
//	//如果占位符中的名称和形参名一致，在@PathVariable可以不指定名�?
//	@RequestMapping("/NodeView/{id}")
//	public @ResponseBody NodeCustom NodeView(@PathVariable("id") Integer id)throws Exception{
//		
//		//调用service查询商品信息
//		NodeCustom NodeCustom = NodeService.findNodeById(id);
//		
//		return NodeCustom;
//		
//	}
//	
//
//	// 商品信息修改提交
//	// 在需要校验的pojo前边添加@Validated，在�?��校验的pojo后边添加BindingResult
//	// bindingResult接收校验出错信息
//	// 注意：@Validated和BindingResult bindingResult是配对出现，并且形参顺序是固定的（一前一后）�?
//	// value={ValidGroup1.class}指定使用ValidGroup1分组�?校验
//	// @ModelAttribute可以指定pojo回显到页面在request中的key
//	@RequestMapping("/editNodeSubmit")
//	public String editNodeSubmit(
//			Model model,
//			HttpServletRequest request,
//			Integer id,
//			@ModelAttribute("Node") @Validated(value = { ValidGroup1.class }) NodeCustom NodeCustom,
//			BindingResult bindingResult,
//			MultipartFile Node_pic//接收商品图片
//			) throws Exception {
//
//		// 获取校验错误信息
//		if (bindingResult.hasErrors()) {
//			// 输出错误信息
//			List<ObjectError> allErrors = bindingResult.getAllErrors();
//
//			for (ObjectError objectError : allErrors) {
//				// 输出错误信息
//				System.out.println(objectError.getDefaultMessage());
//
//			}
//			// 将错误信息传到页�?
//			model.addAttribute("allErrors", allErrors);
//			
//			
//			//可以直接使用model将提交pojo回显到页�?
//			model.addAttribute("Node", NodeCustom);
//			
//			// 出错重新到商品修改页�?
//			return "Node/editNode";
//		}
//		//原始名称
//		String originalFilename = Node_pic.getOriginalFilename();
//		//上传图片
//		if(Node_pic!=null && originalFilename!=null && originalFilename.length()>0){
//			
//			//存储图片的物理路�?
//			String pic_path = "F:\\develop\\upload\\temp\\";
//			
//			
//			//新的图片名称
//			String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
//			//新图�?
//			File newFile = new File(pic_path+newFileName);
//			
//			//将内存中的数据写入磁�?
//			Node_pic.transferTo(newFile);
//			
//			//将新图片名称写到NodeCustom�?
//			NodeCustom.setPic(newFileName);
//			
//		}
//		
//
//		// 调用service更新商品信息，页面需要将商品信息传到此方�?
//		NodeService.updateNode(id, NodeCustom);
//
//		// 重定向到商品查询列表
//		// return "redirect:queryNode.action";
//		// 页面转发
//		// return "forward:queryNode.action";
//		return "success";
//	}
//
//	// 批量删除 商品信息
//	@RequestMapping("/deleteNode")
//	public String deleteNode(Integer[] Node_id) throws Exception {
//
//		// 调用service批量删除商品
//		// ...
//
//		return "success";
//
//	}
//
//	// 批量修改商品页面，将商品信息查询出来，在页面中可以编辑商品信�?
//	@RequestMapping("/editNodeQuery")
//	public ModelAndView editNodeQuery(HttpServletRequest request,
//			NodeQueryVo NodeQueryVo) throws Exception {
//
//		// 调用service查找 数据库，查询商品列表
//		List<NodeCustom> NodeList = NodeService.findNodeList(NodeQueryVo);
//
//		// 返回ModelAndView
//		ModelAndView modelAndView = new ModelAndView();
//		// 相当 于request的setAttribut，在jsp页面中�?过NodeList取数�?
//		modelAndView.addObject("NodeList", NodeList);
//
//		modelAndView.setViewName("Node/editNodeQuery");
//
//		return modelAndView;
//
//	}
//
//	// 批量修改商品提交
//	// 通过NodeQueryVo接收批量提交的商品信息，将商品信息存储到NodeQueryVo中NodeList属�?中�?
//	@RequestMapping("/editNodeAllSubmit")
//	public String editNodeAllSubmit(NodeQueryVo NodeQueryVo)
//			throws Exception {
//
//		return "success";
//	}

}
