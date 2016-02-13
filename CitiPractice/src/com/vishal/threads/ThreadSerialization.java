package com.vishal.threads;

public class ThreadSerialization {
	
	private Thread t1 = new Thread("T1");
	private Thread t2 = new Thread("T2");
	private Thread t3 = new Thread("T3");
	
	private void startThreads() {
		
	}
	
	private void serializeThreads() throws InterruptedException {
		t1.join();
		t2.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private class FirstThread extends Thread {
		@Override
		public void run() {
		}
		
	}

}
