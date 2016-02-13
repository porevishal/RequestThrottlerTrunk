package com.vishal.test;

import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		
		Integer[] intArray = {35,48,22,34,55,78, 98};
		
		Arrays.sort(intArray);
		
		List<Integer> asList = Arrays.asList(intArray);
		
		for (Integer integer : asList) {
			System.out.println("Lets see if the array is sorted "+integer);
		}
		
		//lets find 22 and see 
		int index = Arrays.binarySearch(intArray, 78);
		
		System.out.println("Lets see the index of the requested number "+index);
		
		//lets print the actual number
		System.out.println("Actual number is "+intArray[index]);
		
		//make a copy
		Integer[] copyOfIntegers = Arrays.copyOf(intArray, 10);
		List<Integer> asIsListList = Arrays.asList(copyOfIntegers);
		
		for (Integer integer : asIsListList) {
			System.out.println("Lets see the new output "+integer);
		}
		
	}

}
