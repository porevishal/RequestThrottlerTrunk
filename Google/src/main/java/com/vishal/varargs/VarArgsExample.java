package com.vishal.varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VarArgsExample {

	public static void main(String[] args) {

		String[] stringArray = {"yahoo","google","linked-in"};
		List<String> myArrayList = new ArrayList<String>(Arrays.asList("yahoo","google","twitter"));
		List<Integer> myIntegers = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		
		int[] intArray = {7,8,9,10};
		 System.out.println("xxx"+Arrays.toString(intArray));
		
		System.out.println(stringArray);
		System.out.println(myArrayList);
		System.out.println(myIntegers);
		System.out.println(intArray);
		varArgFunc(1,2,3,4,5,6);
		
	
	}
	
	private static void varArgFunc(int... args) {
		
		System.out.println(Arrays.asList(args));
	}

}
