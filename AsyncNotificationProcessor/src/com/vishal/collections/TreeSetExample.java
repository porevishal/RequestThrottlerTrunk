package com.vishal.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		Set<Integer> integerSet = new TreeSet<Integer>(Arrays.asList(3,5,6,0,7,1,3,8,2,9,4));
		
		Iterator<Integer> iterator = integerSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
	}

}
