package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.NodeMapper;
import cn.itcast.ssm.mapper.NodeMapperUser;
import cn.itcast.ssm.po.NodeExtend;
import cn.itcast.ssm.po.NodeQueryPo;
import cn.itcast.ssm.po.NodeQueryVo;
import cn.itcast.ssm.po.UserExtend;
import cn.itcast.ssm.service.NodeService;

public class NodeServiceImpl implements NodeService{

	@Autowired
	private NodeMapperUser nodeMapperUser;
	
	@Autowired
	private NodeMapper nodeMapper;

	@Override
	public List<NodeExtend> findNodeInfo(NodeQueryVo nodeQueryVo)
			throws Exception {
		return null;
	}

	@Override
	public List<NodeExtend> findNode() throws Exception {
		return nodeMapperUser.findNode();
	}

	@Override
	public NodeExtend findNodeByUserId(Integer userId) throws Exception {
		return nodeMapperUser.findNodeByUserId(userId);
	}

	@Override
	public void updateNode(NodeExtend nodeExtend) {
		nodeMapperUser.updateNode(nodeExtend);
	}

	@Override
	public void deleteNode(Integer nodeid) {
		nodeMapperUser.deleteNode(nodeid);
		
	}
	
	@Override
	public void deleteBatchNodes(String[] ids) {		
		nodeMapperUser.deleteBatchNodes(ids);
	}

	@Override
	public void addNode(NodeExtend nodeExtend) {
		nodeMapperUser.addNode(nodeExtend);
		
	}

	@Override
	public List<NodeExtend> findAllNodeByQueryPo(NodeQueryPo nodeQueryPo) {
		// TODO Auto-generated method stub
		return nodeMapperUser.findAllNodeByQueryPo(nodeQueryPo);
	}

	@Override
	public List<NodeExtend> findNodeByQueryPo(NodeQueryPo nodeQueryPo) {
		// TODO Auto-generated method stub
		return nodeMapperUser.findAllNodeByQueryPo(nodeQueryPo);
	}

}
