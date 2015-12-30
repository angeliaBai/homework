package cn.itcast.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.ssm.mapper.UserMapper;
import cn.itcast.ssm.mapper.UserMapperUser;
import cn.itcast.ssm.po.UserExtend;
import cn.itcast.ssm.po.UserQueryPo;
import cn.itcast.ssm.po.UserQueryResultPo;
import cn.itcast.ssm.po.UserQueryVo;
import cn.itcast.ssm.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapperUser userMapperUser;
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<UserExtend> findUserByUserId(UserQueryVo userQueryVo) throws Exception {
		return userMapperUser.findUserInfo(userQueryVo);
	}

	@Override
	public List<UserExtend> findAllUser() throws Exception {
		
		return userMapperUser.findUser();
	}

	@Override
	public UserExtend findUserByUserId(Integer userid) throws Exception {
		return userMapperUser.findUserByUserId(userid);
	}

	@Override
	public void updateUser(UserExtend userExtend) {
		userMapperUser.updateUser(userExtend);
	}

	@Override
	public void deleteUser(Integer userid) {
		userMapperUser.deleteUser(userid);
		
	}

	@Override
	public void addUser(UserExtend userExtend) {
		userMapperUser.addUser(userExtend);
		
	}

	@Override
	public List<UserExtend> findUserByQueryPo(UserQueryPo userQueryPo) {
		// TODO Auto-generated method stub
		return userMapperUser.findUserByQueryPo(userQueryPo);
	}

	@Override
	public void deleteBatchUsers(String[] ids) {		
		userMapperUser.deleteBatchUsers(ids);
	}

	@Override
	public List<UserExtend> findAllUserByQueryPo(UserQueryPo userQueryPo) {
		// TODO Auto-generated method stub
		 return userMapperUser.findAllUserByQueryPo(userQueryPo);
	}

	@Override
	public Integer verifyLogin(UserExtend userExtend) {
		// TODO Auto-generated method stub
		return userMapperUser.verifyLogin(userExtend);
	}

	@Override
	public Integer ifUserExist(UserExtend userExtend) {
		// TODO Auto-generated method stub
		return userMapperUser.ifUserExist(userExtend);
	}

	@Override
	public Integer registerUser(UserExtend userExtend) {
		// TODO Auto-generated method stub
		return userMapperUser.addUser(userExtend);
	}

}
