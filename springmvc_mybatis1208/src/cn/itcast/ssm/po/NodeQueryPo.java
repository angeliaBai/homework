package cn.itcast.ssm.po;

public class NodeQueryPo {
	public String nodeIp;
    private Integer page = 1;
    private Integer rows = 10;
    private Integer index = 0;
    
	public Integer getIndex() {
		return index;
	}
	public void setIndex(Integer index) {
		this.index = index;
	}
	
	public String getNodeIp() {
		return nodeIp;
	}
	public void setNodeIp(String nodeIp) {
		this.nodeIp = nodeIp;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
	

}
