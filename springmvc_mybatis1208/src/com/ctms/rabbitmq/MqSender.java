package com.ctms.rabbitmq;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.SerializationUtils;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;
import com.rabbitmq.client.QueueingConsumer;
import com.ctms.beans.*;

public class MqSender extends MqManager{
	
//	public static String ExchangeName = "ServerExchange"; 
//	public static String HostIP  = "192.168.40.1";
//	protected Connection connection;
//	protected Channel channel;
//	public QueueingConsumer consumer;
//	
//	public RabbitmqUtils() throws Exception
//	{
//		ConnectionFactory factory = new ConnectionFactory();  
//        factory.setHost(HostIP);  
//        factory.setPort(5672);
//        factory.setUsername("admin");
//        factory.setPassword("admin");
//        connection = factory.newConnection();  
//        channel = connection.createChannel(); 
//        channel.exchangeDeclare(ExchangeName, "direct" );
//        String queueName = channel.queueDeclare().getQueue();
//        channel.queueBind(queueName, ExchangeName, "server");
//        this.consumer = new QueueingConsumer(channel);
//	}
	
//	public void close() throws Exception  	
//	{
//		this.channel.close();
//        this.connection.close();
//    }
	
	public void exit() {
		closeConnection();
	}
	
	public int send2All(Command command)
	{
		try {
			Map<String, String> message = new HashMap<String,String>();
			message.put("type",command.getType().toString());
			message.put("date", command.getDate().toString());
			sendMessage("all",SerializationUtils.serialize((Serializable) message));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public int sendCommand(String nodeId,Command command)
	{
		try {
			Map<String, String> message = new HashMap<String,String>();
			message.put("type",command.getType().toString());
			message.put("commandId", command.getCommandId());
			message.put("taskId",command.getTaskId());
			message.put("taskName", command.getTaskName());
			//message.put("date", command.getDate().toString());
			sendMessage("nodeId_"+nodeId,(Serializable) message);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	protected void sendMessage(String routingKey,Serializable object) throws IOException {
		Channel channel = getChannel();
		if (channel == null)
			return;

		try {
			channel.exchangeDeclare(this.mqConfig.getExchangeName(), "direct" );
			channel.basicPublish(this.mqConfig.getExchangeName(),routingKey, MessageProperties.PERSISTENT_TEXT_PLAIN, SerializationUtils.serialize(object));
			System.out.println(" [x] Sent '" + object.toString() + "'");
			channel.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
    } 
}
