package cn.itcast.ssm.po;

import java.util.List;


public class TaskQueryResultPo {
    private long count;
    List<TaskExtend> tasks;

    public TaskQueryResultPo(long count, List<TaskExtend> tasks) {
        this.count = count;
        this.tasks = tasks;
    }

	public TaskQueryResultPo() {
		this.count = count;
        this.tasks = tasks;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<TaskExtend> getTasks() {
		return tasks;
	}

	public void settasks(List<TaskExtend> tasks) {
		this.tasks = tasks;
	}
    
    
}
