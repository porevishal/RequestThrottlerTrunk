package com.vishal.wait.notify;

public class MainClass {

	public static void main(String[] args) {

		final WaitNotifyExample1 waitNotifyExample1 = new WaitNotifyExample1();

		Thread thread1 = new Thread("Thread 1") {

			@Override
			public void run() {
				System.out.println("Calling notify..");
				/*try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				waitNotifyExample1.notifyMethod();
			}
		};

		Thread thread2 = new Thread("Thread 2") {

			@Override
			public void run() {
				System.out.println("calling wait...");
				waitNotifyExample1.waitMethod();
			}
		};

		thread1.start();
		thread2.start();

	}

}
