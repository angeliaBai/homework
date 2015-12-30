package cn.itcast.ssm.controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserControllerTest {

	@Test
	public void testDeleteBatchUsers() throws Exception {
		UserController uc=new UserController();
		uc.deleteBatchUsers("8,4");
	}

}
