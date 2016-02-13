package com.vishal.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>(Arrays.asList(1,4,3,2,5,6,7,4,7,8));
		
		ListIterator<Integer> listIterator = list.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		//list.addAll(Arrays.asList(0,22,44,33,11,88));
		
		System.err.println("NExt ");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
	}

}
