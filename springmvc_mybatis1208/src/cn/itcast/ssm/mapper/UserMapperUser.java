package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.UserExtend;
import cn.itcast.ssm.po.UserQueryPo;
import cn.itcast.ssm.po.UserQueryResultPo;
import cn.itcast.ssm.po.UserQueryVo;

public interface UserMapperUser {

	public List<UserExtend> findUserInfo(UserQueryVo userQueryVo) throws Exception;
	public List<UserExtend> findUser() throws Exception;
	public UserExtend findUserByUserId(Integer userId) throws Exception;
	public void updateUser(UserExtend userExtend);
	public void deleteUser(Integer userid);
	public Integer addUser(UserExtend userExtend);
	public List<UserExtend> findUserByQueryPo(UserQueryPo userQueryPo);
	public void deleteBatchUsers(String[] ids);
	public List<UserExtend> findAllUserByQueryPo(UserQueryPo userQueryPo);
	public Integer verifyLogin(UserExtend userExtend);
	public Integer ifUserExist(UserExtend userExtend);

}
