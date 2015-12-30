package cn.itcast.ssm.po;

import java.util.List;


public class UserQueryResultPo {
    private long count;
    List<UserExtend> users;

    public UserQueryResultPo(long count, List<UserExtend> users) {
        this.count = count;
        this.users = users;
    }

	public UserQueryResultPo() {
		this.count = count;
        this.users = users;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public List<UserExtend> getUsers() {
		return users;
	}

	public void setUsers(List<UserExtend> users) {
		this.users = users;
	}
    
    
}
