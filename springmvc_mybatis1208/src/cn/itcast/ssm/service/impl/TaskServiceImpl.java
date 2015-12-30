package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.TaskMapper;
import cn.itcast.ssm.mapper.TaskMapperTask;
import cn.itcast.ssm.po.TaskExtend;
import cn.itcast.ssm.po.TaskQueryPo;
import cn.itcast.ssm.po.TaskQueryResultPo;
import cn.itcast.ssm.po.TaskQueryVo;
import cn.itcast.ssm.service.TaskService;

public class TaskServiceImpl implements TaskService{

	@Autowired
	private TaskMapperTask taskMapperTask;
	
	@Autowired
	private TaskMapper taskMapper;

	@Override
	public TaskExtend findTaskByTaskId(Integer taskid) throws Exception {
		return taskMapperTask.findTaskByTaskId(taskid);
	}

	@Override
	public void updateTask(TaskExtend taskExtend) {
		taskMapperTask.updateTask(taskExtend);
	}

	@Override
	public void deleteTask(Integer taskid) {
		taskMapperTask.deleteTask(taskid);
		
	}

	@Override
	public void addTask(TaskExtend taskExtend) {
		taskMapperTask.addTask(taskExtend);
		
	}

	@Override
	public List<TaskExtend> findTaskByQueryPo(TaskQueryPo taskQueryPo) {
		// TODO Auto-generated method stub
		return taskMapperTask.findTaskByQueryPo(taskQueryPo);
	}

	@Override
	public void deleteBatchTasks(String[] ids) {		
		taskMapperTask.deleteBatchTasks(ids);
	}

	@Override
	public List<TaskExtend> findAllTaskByQueryPo(TaskQueryPo taskQueryPo) {
		// TODO Auto-generated method stub
		 return taskMapperTask.findAllTaskByQueryPo(taskQueryPo);
	}

	@Override
	public List<TaskExtend> findTaskByTaskId(TaskQueryVo taskQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TaskExtend> findAllTask() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
