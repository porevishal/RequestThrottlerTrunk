package com.vishal.timer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VishalExecutors {

	public void createThreads() {
		System.out.println("Running Threads now");

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);

		for (int i = 0; i < 500; i++) {
			newFixedThreadPool.execute(new Runnable() {

				public void run() {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("My name is Lakhan");
				}
			});
		}
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 100; i++) {
			newFixedThreadPool.execute(new Runnable() {

				public void run() {
					System.out.println("My name is PAresh");
				}
			});
		}

	}
}
