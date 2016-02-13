package com.vishal.concurrency;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapExample {

	public static void main(String[] args) {
		
		ConcurrentSkipListMap<Integer, Integer> concurrentSkipListMap = new ConcurrentSkipListMap<Integer, Integer>();
		
		concurrentSkipListMap.put(111, 1);
		concurrentSkipListMap.put(11, 1);
		concurrentSkipListMap.put(1, 1);
		concurrentSkipListMap.put(33, 1);
		concurrentSkipListMap.put(66, 1);
		concurrentSkipListMap.put(99, 1);
		concurrentSkipListMap.put(73, 1);
		concurrentSkipListMap.put(8, 1);
		
		Iterator<Integer> iterator = concurrentSkipListMap.navigableKeySet().iterator();
		
		while(iterator.hasNext())
		System.out.println(iterator.next());
		

	}

}
