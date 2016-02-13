package com.vishal.concurrency;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

	public static void main(String[] args) {

		ConcurrentHashMap<Integer, Integer> concurrentHashMap = new ConcurrentHashMap<Integer, Integer>();
		
		concurrentHashMap.put(1, 1);
		concurrentHashMap.put(2, 2);
		
		Iterator<Integer> iterator = concurrentHashMap.keySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
