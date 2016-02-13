package com.vishal.StringReverse;

public class StingReverse {
	
	private static final String stringToBeReversedString = "Yahoo";

	public static void main(String[] args) {
		
		char[] charArray = stringToBeReversedString.toCharArray();
		
		int length = charArray.length;
		
		while(length > 0) {
			System.out.println(charArray[--length]);
		}

	}

}
