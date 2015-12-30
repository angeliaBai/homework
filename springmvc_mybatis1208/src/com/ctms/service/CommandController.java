package com.ctms.service;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import com.ctms.beans.Command;

public class CommandController {

	private static void time(final Command cmd) {
		// TODO Auto-generated method stub
 
		
		int H = 14;
		int M = 9;

		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.HOUR_OF_DAY, H); // 控制时
		calendar.set(Calendar.MINUTE, M); // 控制分
		calendar.set(Calendar.SECOND, 0); // 控制秒

		Date time = calendar.getTime(); // 得出执行任务的时间,此处为今天的12：00：00
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			    CommandQueue q = CommandQueue.getCommendQueue();
				q.push(cmd);

				
			}
			
		}, time);

	}
}
