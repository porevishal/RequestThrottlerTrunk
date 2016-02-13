package com.vishal.treemap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class CustomTreeMap {
	
	private NavigableMap<String, String> customMap = new TreeMap<String, String>();
	private Map<String, String> hashMap = new HashMap<String, String>();
	
	public Map<String, String> getHashMap() {
		return hashMap;
	}

	public NavigableMap<String, String> getCustomMap() {
		return customMap;
	}

	public static void main(String[] args) {
		
		
		
		CustomTreeMap customTreeMap = new CustomTreeMap();
		NavigableMap<String, String> customMap2 = customTreeMap.getCustomMap();
		
		customMap2.put("Vishal", "POre");
		customMap2.put("Abhay", "Zore");
		customMap2.put("Ashok", "KOre");
		customMap2.put("Ishaan", "More");
		customMap2.put("Siddhi", "Pohe");
		customMap2.put("Vikram", "Kode");
		
		Iterator<Entry<String, String>> iterator = customMap2.entrySet().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\n");
		
		customTreeMap.getHashMap().putAll(customMap2);
		Iterator<Entry<String, String>> iterator2 = customTreeMap.getHashMap().entrySet().iterator();
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		
		Entry<String, String> ceilingEntry = customMap2.ceilingEntry("Vishall");
		
		System.out.println("\n");
		System.out.println(ceilingEntry.getKey());
		
		
		
	}
	

}
