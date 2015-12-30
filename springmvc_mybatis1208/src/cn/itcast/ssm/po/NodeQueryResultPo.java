package cn.itcast.ssm.po;

import java.util.List;


public class NodeQueryResultPo {
    private long count;
    List<NodeExtend> nodes;

    public NodeQueryResultPo(long count, List<NodeExtend> nodes) {
        this.count = count;
        this.nodes = nodes;
    }

	public NodeQueryResultPo() {
		this.count = count;
        this.nodes = nodes;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<NodeExtend> getNodes() {
		return nodes;
	}

	public void setNodes(List<NodeExtend> nodes) {
		this.nodes = nodes;
	}
    
    
}
