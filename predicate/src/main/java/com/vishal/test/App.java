package com.vishal.test;

import java.util.Arrays;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

/**
 * Predicates
 *
 */
public class App {
	
    public static void main( String[] args ){
    	
    	Predicate<Integer> evenPredicate = new Predicate<Integer>() {

			public boolean apply(Integer input) {
				
				if (input%2 == 0 ) {
					return true;
				}
				
				return false;
				
			}
		};
		
		Integer[] intArray = {10,11,12,13,14,15,16,17,18,19,20};
		
		List<Integer> listOfIntegers = Arrays.asList(intArray);
		
		Iterable<Integer> filter = Iterables.filter(listOfIntegers, evenPredicate);
		
		
		for (Integer integer : filter) {
			System.out.println("Fitered "+integer);
		}
		
		for (Integer integer : listOfIntegers) {
			System.out.println("Integer "+integer);
		}
		
		for (Integer integer : listOfIntegers) {
			
			if(evenPredicate.apply(integer)) {
				System.out.println("Even Number "+integer);
			}
		}
		
		
    }
}
