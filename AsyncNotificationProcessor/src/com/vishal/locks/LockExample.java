package com.vishal.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

	private Lock lock = new ReentrantLock();
	private int counter = 0;

	public static void main(String[] args) {

		final LockExample lockExample = new LockExample();

		Runnable runnable1 = new Runnable() {

			@Override
			public void run() {
				try {
					lockExample.threadSafeMethod();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Runnable runnable2 = new Runnable() {

			@Override
			public void run() {
				try {
					lockExample.threadSafeMethod();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		new Thread(runnable1, "Terminator 1").start();
		;
		new Thread(runnable2, "Terminator 2").start();
		;

	}

	public void threadSafeMethod() throws InterruptedException {

		//boolean wasIAbleToLock = lock.tryLock(1, TimeUnit.SECONDS);
		lock.lockInterruptibly();
		/*System.out.println("Was I able to lock ? " + wasIAbleToLock
				+ " Name of the thread " + Thread.currentThread());
		*/counter++;
		System.out.println("Counter " + counter + " Thread Name "
				+ Thread.currentThread());
		while(true) {
			int i=0;
			Thread.sleep(1000);
			i = i+ 1;
			System.out.println(i + " "+ Thread.currentThread());
		}
		//Thread.sleep(1000 * 10);
		//if (wasIAbleToLock)
			//lock.unlock();

		/*System.out
				.println("This is going to be a quintessential case of catastrophe...After locking "
						+ Thread.currentThread());*/

	}

}
