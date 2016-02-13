package com.vishal.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		treeMap.put(1, "ONE");
		
		treeMap.put(9,"NINE");
		treeMap.put(6,"SIX");
		treeMap.put(3,"THREE");
		treeMap.put(8,"EIGHT");
		treeMap.put(0,"ZERO");
		treeMap.put(2,"TWO");
		treeMap.put(7,"SEVEN");
		treeMap.put(5,"FIVE");
		treeMap.put(4, "FOUR");
		
		
		Iterator<Entry<Integer, String>> iterator = treeMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next().getValue());
		}
		
		

	}

}
