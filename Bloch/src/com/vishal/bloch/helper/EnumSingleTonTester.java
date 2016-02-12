package com.vishal.bloch.helper;

import com.vishal.bloch.SingleTonUsingEnum;

public class EnumSingleTonTester {

	public static void main(String[] args) {
		
		SingleTonUsingEnum instance = SingleTonUsingEnum.INSTANCE;
		String name = instance.name();
		
		System.out.println("Name "+name);
		
		System.out.println("Age "+ SingleTonUsingEnum.INSTANCE.getAge());
		System.out.println("Sex "+ SingleTonUsingEnum.INSTANCE.getName());

	}

}
