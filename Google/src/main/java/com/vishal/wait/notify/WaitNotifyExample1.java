package com.vishal.wait.notify;

public class WaitNotifyExample1 {

	private boolean threadSafe = false;

	public synchronized void waitMethod() {

		while (!threadSafe) {

			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Interrupted ");
			}
		}
		System.out.println("I was in wait method");
	}

	public synchronized void notifyMethod() {

		threadSafe = true;
		System.out.println("Notifying all...");
		notifyAll();

	}

}
