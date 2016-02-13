package com.vishal.sleeper;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Mainer {
	
	BlockingQueue<String> queue = new ArrayBlockingQueue<String>(10);

	public static void main(String[] args) {
		
		Thread testThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("This is scrazy stuff...");
				try {
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					System.out.println("I was interruped "+Thread.currentThread().isInterrupted()+" "+Thread.currentThread().getName());
				}
				
			}
		}, "Yahoo Thread");
		
		testThread.start();
		try {
			testThread.join(10000);
		} catch (InterruptedException e) {
			
			System.out.println("I am not responsible..");
		}
		testThread.interrupt();
		

	}

}
