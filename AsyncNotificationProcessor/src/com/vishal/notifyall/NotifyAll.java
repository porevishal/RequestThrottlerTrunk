package com.vishal.notifyall;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NotifyAll {

	private static int counter = 0;

	private static Lock lock = new ReentrantLock();

	private static Condition condition = lock.newCondition();

	private static Runnable oddThread = new Runnable() {

		@Override
		public void run() {

			if (counter % 2 == 0) {

				try {

					condition.await();

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("Odd Thread " + counter++);
				condition.signal();

			}

		}
	};

	private static Runnable evenThread = new Runnable() {

		@Override
		public void run() {

			if (counter % 2 > 0) {
				try {
					condition.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("Even Thread " + counter++);
				condition.signal();

			}

		}
	};

	public static void main(String[] args) {

		new Thread(evenThread).start();;
		new Thread(oddThread).start();

	}

}
