package cn.itcast.ssm.service;

import java.util.List;
import cn.itcast.ssm.po.TaskExtend;
import cn.itcast.ssm.po.TaskQueryPo;
import cn.itcast.ssm.po.TaskQueryVo;

public interface TaskService {

	public List<TaskExtend> findTaskByTaskId(TaskQueryVo taskQueryVo) throws Exception;
	public TaskExtend findTaskByTaskId(Integer taskid) throws Exception;
	public List<TaskExtend> findAllTask() throws Exception;
	public void updateTask(TaskExtend taskExtend);
	public void deleteTask(Integer taskid);
	public void addTask(TaskExtend taskExtend);
	public List<TaskExtend> findTaskByQueryPo(TaskQueryPo taskQueryPo);
	public void deleteBatchTasks(String[] taskids);
	public List<TaskExtend> findAllTaskByQueryPo(TaskQueryPo taskQueryPo);
}
