package cn.itcast.ssm.po;

public class Node {
    private Integer nodeid;

    private String nodeip;

    private Integer taskid;

    private Double cpurate;

    private Double memoryrate;

    public Integer getNodeid() {
        return nodeid;
    }

    public void setNodeid(Integer nodeid) {
        this.nodeid = nodeid;
    }

    public String getNodeip() {
        return nodeip;
    }

    public void setNodeip(String nodeip) {
        this.nodeip = nodeip == null ? null : nodeip.trim();
    }

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public Double getCpurate() {
        return cpurate;
    }

    public void setCpurate(Double cpurate) {
        this.cpurate = cpurate;
    }

    public Double getMemoryrate() {
        return memoryrate;
    }

    public void setMemoryrate(Double memoryrate) {
        this.memoryrate = memoryrate;
    }
}