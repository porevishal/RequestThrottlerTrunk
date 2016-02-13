package com.vishal;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
	
	final static CountDownLatch COUNT_DOWN_LATCH = new CountDownLatch(1);
	
	public static void main(String[] args) {
		
		COUNT_DOWN_LATCH.countDown();
		
	}

}
