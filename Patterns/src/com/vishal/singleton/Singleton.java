package com.vishal.singleton;


public class Singleton {

	private static final Singleton INSTANCE = new Singleton();
	private final String name = "vishal";
	
	public String getName() {
		return name;
	}

	private Singleton() {
		
	}
	
	public enum SingletonEnum{
		SINGLE_INSTANCE;
		
		private final Singleton singleton = INSTANCE;
		private SingletonEnum() {
		}
		
		public Singleton getSingleton() {
			return SINGLE_INSTANCE.singleton;
		}
	}
	
}
