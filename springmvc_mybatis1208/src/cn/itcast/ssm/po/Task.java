package cn.itcast.ssm.po;

import java.util.Date;

public class Task {
    private Integer taskid;

    private String taskname;

    private Integer userid;

    private Date starttime;

    private Date runtime;

    private Date endtime;

    private Integer status;

    private Double interval;

    private String jarurl;

    private Double finishrate;

    private String logurl;

    public Integer getTaskid() {
        return taskid;
    }

    public void setTaskid(Integer taskid) {
        this.taskid = taskid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname == null ? null : taskname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getRuntime() {
        return runtime;
    }

    public void setRuntime(Date runtime) {
        this.runtime = runtime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getInterval() {
        return interval;
    }

    public void setInterval(Double interval) {
        this.interval = interval;
    }

    public String getJarurl() {
        return jarurl;
    }

    public void setJarurl(String jarurl) {
        this.jarurl = jarurl == null ? null : jarurl.trim();
    }

    public Double getFinishrate() {
        return finishrate;
    }

    public void setFinishrate(Double finishrate) {
        this.finishrate = finishrate;
    }

    public String getLogurl() {
        return logurl;
    }

    public void setLogurl(String logurl) {
        this.logurl = logurl == null ? null : logurl.trim();
    }
}