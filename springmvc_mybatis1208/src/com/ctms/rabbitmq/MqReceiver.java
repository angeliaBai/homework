package com.ctms.rabbitmq;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.SerializationUtils;

import com.ctms.service.TaskResponseManager;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.QueueingConsumer;

public class MqReceiver extends MqManager implements Runnable{

	public void loopReceiveMessage() {
		QueueingConsumer consumer = getAndConfigChannel();
		//QueueingConsumer.Delivery delivery = null;
		while (true)
		{
			try {
				System.out.println("wait message");
				QueueingConsumer.Delivery delivery = consumer.nextDelivery();
				System.out.println(" Server Received '" + delivery.getBody().toString() + "'");
				Map<String,String> map = (HashMap<String, String>)SerializationUtils.deserialize(delivery.getBody());
				System.out.println(" Server Received '" + map.get("type") + "'");
				String responseType = map.get("type");
				switch(responseType)
				{
				case "commandResponse":
					TaskResponseManager response = new TaskResponseManager();
					response.setResMap(map);
					Thread t1 = new Thread(response);
					t1.start();
					break;
				case "nodeInfo":
					
					break;
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private QueueingConsumer getAndConfigChannel() {
		Channel channel = getChannel();
		if (channel == null)
			return null;
		QueueingConsumer consumer = new QueueingConsumer(channel);
		try {
			channel.exchangeDeclare(this.mqConfig.getExchangeName(), "direct" );
			channel.queueDeclare(this.mqConfig.getQueueName(), true, false, false, null);
			channel.queueBind(this.mqConfig.getQueueName(),this.mqConfig.getExchangeName(), "server");
			channel.basicConsume(this.mqConfig.getQueueName(), true, consumer);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return consumer;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		loopReceiveMessage();
	}
}
