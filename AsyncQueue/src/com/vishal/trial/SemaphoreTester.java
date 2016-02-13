package com.vishal.trial;

import java.util.concurrent.Semaphore;

public class SemaphoreTester {
	
	private final Semaphore semaphore = new Semaphore(0);
	
	public Semaphore getSemaphore() {
		return semaphore;
	}

	public static void main(String[] args) {
		
		SemaphoreTester semaphoreTester = new SemaphoreTester();
		
		semaphoreTester.getSemaphore().release();
		semaphoreTester.getSemaphore().release();
		semaphoreTester.getSemaphore().release();
		semaphoreTester.getSemaphore().release();
		
		System.out.println("Count of Semapahores "+semaphoreTester.getSemaphore().availablePermits());

	}

}
