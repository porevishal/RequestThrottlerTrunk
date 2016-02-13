package com.vishal.concurrency;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeExample {

	public static void main(String[] args) {
		
		ConcurrentLinkedDeque<Integer> concurrentLinkedDeque = new ConcurrentLinkedDeque<Integer>(Arrays.asList(2,4,2,8,9));
		
		Iterator<Integer> iterator = concurrentLinkedDeque.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		concurrentLinkedDeque.addFirst(200);
		concurrentLinkedDeque.addLast(300);
		
		iterator = concurrentLinkedDeque.iterator();
		
		System.out.println("\n");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.err.println("First Element "+concurrentLinkedDeque.getFirst());
		
		System.err.println("Last Element "+concurrentLinkedDeque.getLast());

	}

}
