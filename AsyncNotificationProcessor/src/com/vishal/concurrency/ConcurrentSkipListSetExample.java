package com.vishal.concurrency;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExample {

	public static void main(String[] args) throws InterruptedException {

		final ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<Integer>(
				Arrays.asList(3, 5, 1, 2, 6, 4, 7, 9, 7, 0));

		Iterator<Integer> iterator = concurrentSkipListSet.iterator();

		while (iterator.hasNext()) {
			Thread.sleep(100);
			System.out.println(iterator.next());
		}

		Thread insertionThread = new Thread(new Runnable() {

			@Override
			public void run() {
				concurrentSkipListSet.addAll(Arrays.asList(34, 46, 98, 66, 11,
						22, 0, 77));
			}
		}, "t1");

		insertionThread.start();
		
		
		Thread insertionThread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				/*concurrentSkipListSet.addAll(Arrays.asList(54, 76, 938, 366, 411,
						212, 0, 797));*/
			}
		}, "t1");

		insertionThread2.start();
		
		System.out.println("\nNew Iteration ");
		
		Iterator<Integer> iterator2 = concurrentSkipListSet.descendingIterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		Integer ceiling = concurrentSkipListSet.ceiling(70);
		System.out.println("Ceiling "+ceiling);


	}

}
