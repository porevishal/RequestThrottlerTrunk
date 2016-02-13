package com.vishal;

import java.util.concurrent.SynchronousQueue;

public class SynchronusQueueExample {

	public static void main(String[] args) throws InterruptedException {
		
		final SynchronousQueue<String> synchronousQueue = new SynchronousQueue<String>(true);
		
		System.out.println("Main Thread Running ");
		
		Thread yahooThread = new Thread("Yahoo Consumer") {
			@Override
			public void run() {
				try {
					System.out.println("Running inside Yahoo RUN..");
					String take = synchronousQueue.take();
					System.out.println("Taking "+take);
					System.out.println("Thread name- "+this.getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		yahooThread.start();
		
		Thread googleThread = new Thread("Google Consumer") {
			@Override
			public void run() {
				try {
					System.out.println("Running inside Google RUN..");
					String take = synchronousQueue.take();
					System.out.println("Taking "+take);
					System.out.println("Thread name- "+this.getName());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		googleThread.start();
		
		synchronousQueue.put("APPLE");
		synchronousQueue.put("Samsung");
		
	}

}
