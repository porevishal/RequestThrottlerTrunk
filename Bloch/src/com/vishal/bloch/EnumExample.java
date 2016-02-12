package com.vishal.bloch;

import java.util.Arrays;

public class EnumExample {

	public static void main(String[] args) {
		
		System.out.println("Printing Planet Names "+Planet.values());
		System.out.println("Printing Planet Names using Array "+Arrays.asList(Planet.values()));
		
		System.out.println("Printing using toString "+Planet.EARTH);
	}
}
