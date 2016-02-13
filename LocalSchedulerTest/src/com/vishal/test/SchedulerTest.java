package com.vishal.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerTest {

	private int test = 0;

	public SchedulerTest() {

		test = 1;
	}

	public void testScheduler() {
		ScheduledExecutorService newSingleThreadScheduledExecutor = Executors
				.newSingleThreadScheduledExecutor();
		newSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				System.out.println("This is test one " + test++);

			}
		}, 0, 3, TimeUnit.SECONDS);

	}

	public static void main(String[] args) {

		System.out.println("This is start of main method...");
		
		new SchedulerTest().testScheduler();
		
		System.out.println("This is end of main method...");

	}

}
