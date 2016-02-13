package com.vishal;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueueExample {

	public static void main(String[] args) {

		final BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<String>(
				5);

		final class Producer implements Runnable {

			@Override
			public void run() {

				try {
					blockingQueue.put("Joshua");
					blockingQueue.put("Bloch");
					System.out.println("Put Joshua in the queue");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		final class Producer1 implements Runnable {

			@Override
			public void run() {

				try {
					blockingQueue.put("Martin");
					blockingQueue.put("Fowler");
					System.out.println("Put Mr Fowler in the Queue");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		final class Producer3 implements Runnable {

			@Override
			public void run() {

				try {
					blockingQueue.put("Malcom");
					blockingQueue.put("Gladwell");
					System.out.println("Put an Outlier in the Queue");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

		final class Consumer implements Runnable {

			@Override
			public void run() {
				try {
					System.out.println(getClass() + " " + blockingQueue.take());
					System.out.println(getClass() + " " + blockingQueue.take());
					System.out.println(getClass() + " " + blockingQueue.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		final class Consumer1 implements Runnable {

			@Override
			public void run() {
				try {
					System.out.println(getClass() + " " + blockingQueue.take());
					//System.out.println(getClass() + " " + blockingQueue.take());
					//System.out.println(getClass() + " " + blockingQueue.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);

		newFixedThreadPool.execute(new Producer());
		newFixedThreadPool.execute(new Producer1());
		// newFixedThreadPool.execute(new Producer3());
		newFixedThreadPool.execute(new Consumer());
		newFixedThreadPool.execute(new Consumer1());

		newFixedThreadPool.shutdown();

	}
}
