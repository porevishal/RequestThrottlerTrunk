package com.vishal.trial;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

	public static void main(String[] args) throws InterruptedException {
		
		Semaphore semaphore = new Semaphore(0);
		
		System.out.println("Before acquiring the semaphore");
		
		semaphore.acquire();
		
		System.out.println("After acquiring the semaphore ");
		System.out.println("Testing the SOP");

	}

}
