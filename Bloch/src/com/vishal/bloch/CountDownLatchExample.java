package com.vishal.bloch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample {

	private static int i = 0;

	public static void main(String[] args) throws InterruptedException {
		testMethod();
	}

	private static void testMethod() {

		final CountDownLatch countDownLatch = new CountDownLatch(3);
		ExecutorService pool = Executors.newFixedThreadPool(5);

		for (int j = 0; j <= 3; j++) {
			pool.execute(new Runnable() {
				@Override
				public void run() {
					try {
						countDownLatch.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Test Method Executes " +i++);
				}
			});
			countDownLatch.countDown();
		}
		pool.shutdown();
	}

}
