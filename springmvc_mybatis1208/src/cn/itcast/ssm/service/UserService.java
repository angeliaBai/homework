package cn.itcast.ssm.service;

import java.util.HashMap;
import java.util.List;
import cn.itcast.ssm.po.NodeExtend;
import cn.itcast.ssm.po.NodeQueryVo;
import cn.itcast.ssm.po.UserExtend;
import cn.itcast.ssm.po.UserQueryPo;
import cn.itcast.ssm.po.UserQueryResultPo;
import cn.itcast.ssm.po.UserQueryVo;

public interface UserService {

	public List<UserExtend> findUserByUserId(UserQueryVo userQueryVo) throws Exception;
	public UserExtend findUserByUserId(Integer userid) throws Exception;
	public List<UserExtend> findAllUser() throws Exception;
	public void updateUser(UserExtend userExtend);
	public void deleteUser(Integer userid);
	public void addUser(UserExtend userExtend);
	public List<UserExtend> findUserByQueryPo(UserQueryPo userQueryPo);
	public void deleteBatchUsers(String[] userids);
	public List<UserExtend> findAllUserByQueryPo(UserQueryPo userQueryPo);
	public Integer ifUserExist(UserExtend userExtend);
	public Integer verifyLogin(UserExtend userExtend);
	public Integer registerUser(UserExtend userExtend);
}
