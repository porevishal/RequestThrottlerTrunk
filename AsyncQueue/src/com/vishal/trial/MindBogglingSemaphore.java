package com.vishal.trial;

import java.util.concurrent.Semaphore;

public class MindBogglingSemaphore {
	
	private final Semaphore semaphore = new Semaphore(10);

	public Semaphore getSemaphore() {
		return semaphore;
	}

	public static void main(String[] args) {
		
		MindBogglingSemaphore mindBogglingSemaphore = new MindBogglingSemaphore();
		
		mindBogglingSemaphore.getSemaphore().release();mindBogglingSemaphore.getSemaphore().release();
		mindBogglingSemaphore.getSemaphore().release();mindBogglingSemaphore.getSemaphore().release();
		mindBogglingSemaphore.getSemaphore().release();mindBogglingSemaphore.getSemaphore().release();
		
		System.out.println("This is mindboggling isn't it - "+mindBogglingSemaphore.getSemaphore().availablePermits());

	}

}
