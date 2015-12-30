package cn.itcast.ssm.po;

import java.util.List;

public class UserQueryVo {
	

	private User user;
	
	private UserExtend userExtend;
	
	private List<UserExtend> userlist;


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserExtend getUserExtend() {
		return userExtend;
	}

	public void setUserExtend(UserExtend userExtend) {
		this.userExtend = userExtend;
	}

	public List<UserExtend> getUserlist() {
		return userlist;
	}

	public void setUserlist(List<UserExtend> userlist) {
		this.userlist =userlist;
	}

	
}
