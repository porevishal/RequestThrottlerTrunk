package com.vishal.async.q;

import com.vishal.async.data.IMessage;

public class Task implements Runnable {
	
	private IMessage message;
	
	public Task(IMessage message) {
		this.message = message;
	}

	@Override
	public void run() {
		
		System.out.println(message);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
