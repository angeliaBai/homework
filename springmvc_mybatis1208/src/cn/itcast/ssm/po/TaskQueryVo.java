package cn.itcast.ssm.po;

import java.util.List;

public class TaskQueryVo {
	

	private Task task;
	
	private TaskExtend taskExtend;
	
	private List<TaskExtend> tasklist;

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public TaskExtend getTaskExtend() {
		return taskExtend;
	}

	public void setTaskExtend(TaskExtend taskExtend) {
		this.taskExtend = taskExtend;
	}

	public List<TaskExtend> getTasklist() {
		return tasklist;
	}

	public void setTasklist(List<TaskExtend> tasklist) {
		this.tasklist = tasklist;
	}



	
}
