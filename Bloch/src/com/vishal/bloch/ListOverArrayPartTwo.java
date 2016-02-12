package com.vishal.bloch;

import java.util.Arrays;
import java.util.List;

public class ListOverArrayPartTwo {

	public static void main(String[] args) {

		@SuppressWarnings("unchecked")
		List<String>[] listArr = new List[1];
		List<Integer> listIntegers = Arrays.asList(10);
		
		Object[] objects = listArr;
		objects[0] = listIntegers;
		
		System.out.println(objects[0]);
	}

}
