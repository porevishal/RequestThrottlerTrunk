package com.vishal.tokens;

import com.google.common.base.Splitter;

public class StringTokenizers {

	public static void main(String[] args) {
		
		Splitter onSpace = Splitter.on(" ").omitEmptyStrings().trimResults();
		Splitter onHash = Splitter.on("#");
		
		String sampleString ="There are not   many # good ways of living a happy life";
		
		Iterable<String> split = onSpace.split(sampleString);
		Iterable<String> split2 = onHash.split(sampleString);
		
		for (String string : split) {
			System.out.println("String split using Google splitter "+string);
		}
		
		System.out.println("\n");
		
		for (String string : split2) {
			System.out.println("String split on Hash" +string);
		}
		
		
	}

}
