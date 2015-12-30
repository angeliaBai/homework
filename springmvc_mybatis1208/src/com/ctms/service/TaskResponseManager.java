package com.ctms.service;

import java.util.Map;

public class TaskResponseManager implements Runnable{
	private Map<String,String> resMap;
	public Map<String,String> getResMap() {
		return resMap;
	}
	public void setResMap(Map<String,String> resMap) {
		this.resMap = resMap;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if (resMap != null)
		{
			switch(resMap.get("commandType"))
			{
			case "CREAT":
				
				System.out.println("receive Creat response successful");
				break;
			case "DELETE":
				System.out.println("receive delete response successful");
				break;
			case "RECOVERY":
				System.out.println("receive recovery response successful");
				break;
			case "STOP":
				
				System.out.println("receive stop response successful");
				break;
			}
		}
	}

}
