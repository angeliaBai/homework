package com.ctms.service;

import java.util.Map;

import com.ctms.beans.Command;
import com.ctms.rabbitmq.MqSender;

public class TaskManager implements Runnable{
	MqSender sender;
	Command command;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true)
		{
			if (!CommandQueue.getCommendQueue().isEmpty())
			{
				Command command = CommandQueue.getCommendQueue().pop();
				switch(command.getType())
				{
				case CREAT:
					//¥¥Ω®√¸¡Ó
					//
					sender = new MqSender();
					sender.sendCommand(command.getNodeId(), command);
					sender.exit();
					
					break;
				default:
					sender = new MqSender();
					sender.sendCommand(command.getNodeId(), command);
					sender.exit();
					break;
					
				}
			}
		}
	}
}

