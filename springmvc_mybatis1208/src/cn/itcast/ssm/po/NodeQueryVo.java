package cn.itcast.ssm.po;

import java.util.List;

public class NodeQueryVo {
	

	private Node node;
	
	private NodeExtend nodeExtend;
	
	private List<NodeExtend> nodelist;

	public Node getNode() {
		return node;
	}

	public void setNode(Node node) {
		this.node = node;
	}

	public NodeExtend getNodeExtend() {
		return nodeExtend;
	}

	public void setNodeExtend(NodeExtend nodeExtend) {
		this.nodeExtend = nodeExtend;
	}

	public List<NodeExtend> getNodelist() {
		return nodelist;
	}

	public void setNodelist(List<NodeExtend> nodelist) {
		this.nodelist = nodelist;
	}

	
}
