package com.ctms.rabbitmq;

import java.util.Date;

import com.ctms.beans.*;

public class Mqtest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MqConfig mycfg = MqConfig.getInstance();
		mycfg.setExchangeName("ServerExchange");
		mycfg.setIp("192.168.40.1");
		mycfg.setPort(5672);
		mycfg.setUser("admin");
		mycfg.setPassword("admin");
		mycfg.setQueueName("server");
		MqSender mqUtil = new MqSender();
		mqUtil.setMqConfig(mycfg);
		Command com = new Command();
		com.setCommandId("1001");
		com.setType(Command.CommandType.CREAT);
		com.setTaskName("task1.jar");
		com.setTaskId("001");
		Date da = new Date();
		com.setDate(da);
		mqUtil.sendCommand("1", com);
		//mqUtil.close();
	}

}
