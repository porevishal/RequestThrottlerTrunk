package com.vishal.question.mark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class QuestionMarkExample {

	public static void main(String[] args) {

		questionMarkMethod(new ArrayList<String>(Arrays.asList("abc","pqr")));
		questionMarkMethod(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		questionMarkMethod(new HashSet<Boolean>());
		
	}
	
	private static void questionMarkMethod(Collection<?> collection) {
		
		for (Object object : collection) {
			System.out.println(object);
		}
	}

}
