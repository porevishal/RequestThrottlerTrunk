package com.vishal.concurrency;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueExample {

	public static void main(String[] args) {
		
		ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<Integer>(10, false, Arrays.asList(1,2,5,6,7,8,9,11,12));
		
		Iterator<Integer> iterator = arrayBlockingQueue.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
