package com.vishal.singleton;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton singleon = Singleton.SingletonEnum.SINGLE_INSTANCE.getSingleton();
		System.out.println("My Name is "+singleon.getName());
	}

}
