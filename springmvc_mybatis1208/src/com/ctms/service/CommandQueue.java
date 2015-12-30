package com.ctms.service;

import java.util.LinkedList;
import java.util.Queue;

import com.ctms.beans.Command;


public class CommandQueue {

	private static CommandQueue CommandQueue = null;
	private CommandQueue(){}
	private static Queue<Command> queue = new LinkedList<Command>();
	
	public static CommandQueue getCommendQueue(){
			
		if(CommandQueue == null){
			
			CommandQueue = new CommandQueue();
			
		}
		return CommandQueue;
				
	}

	public void push(Command e) {

		//queue.add(e);
		queue.offer(e);
		System.out.println("TaskQueue add a item");


	}
	
	public Command pop() {

		//Command cmd = queue.remove();
		Command cmd = queue.poll();
		System.out.println("TaskQueue remove a item:"+cmd);
		return cmd;

	}
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	public void clear() {

		queue.clear();
		System.out.println("TaskQueue is null");

	}
}
