package com.vishal.threadserialize;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Worker implements Runnable{
	private BlockingQueue<Integer> queue= new ArrayBlockingQueue<Integer>(1);
	
	private Worker nextWorker;
	
	public BlockingQueue<Integer> getQueue() {
		return queue;
	}


	public void setNextWorker(Worker nextWorker) {
		this.nextWorker = nextWorker;
	}


	@Override
	public void run() {
		while(true) {
		try {
			int i = queue.take();
			System.out.println("Thread "+Thread.currentThread().getName() +" " +i);
			Thread.sleep(1000);
			nextWorker.getQueue().put(i+1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}


}
