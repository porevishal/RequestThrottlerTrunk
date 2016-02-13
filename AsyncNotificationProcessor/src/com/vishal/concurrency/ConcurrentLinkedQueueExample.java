package com.vishal.concurrency;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {

	public static void main(String[] args) {
		
		ConcurrentLinkedQueue<Integer> concurrentLinkedQueue = new ConcurrentLinkedQueue<Integer>();
		
		concurrentLinkedQueue.addAll(Arrays.asList(3,2,1,2,4,5,3,5,88,7676,3,7,43));
		
		Iterator<Integer> iterator = concurrentLinkedQueue.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
