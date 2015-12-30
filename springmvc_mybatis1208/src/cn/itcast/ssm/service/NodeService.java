package cn.itcast.ssm.service;

import java.util.List;
import cn.itcast.ssm.po.NodeExtend;
import cn.itcast.ssm.po.NodeQueryPo;
import cn.itcast.ssm.po.NodeQueryVo;
import cn.itcast.ssm.po.UserExtend;

public interface NodeService {

	public List<NodeExtend> findNodeInfo(NodeQueryVo nodeQueryVo) throws Exception;

	public List<NodeExtend> findNode() throws Exception;

	public NodeExtend findNodeByUserId(Integer userId) throws Exception;
	public void updateNode(NodeExtend nodeExtend);
	public void deleteNode(Integer nodeid);
	public void addNode(NodeExtend nodeExtend);

	public void deleteBatchNodes(String[] ids);

	public List<NodeExtend> findAllNodeByQueryPo(NodeQueryPo nodeQueryPo);

	public List<NodeExtend> findNodeByQueryPo(NodeQueryPo nodeQueryPo);
}
