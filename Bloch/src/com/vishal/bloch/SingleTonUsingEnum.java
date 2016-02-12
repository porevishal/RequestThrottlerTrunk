package com.vishal.bloch;

public enum SingleTonUsingEnum {
	
	INSTANCE(20,"yahoo");
	
	private SingleTonUsingEnum(int age , String name) {
		this.age = age;
		this.name = name;
	}
	
	int age;
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}

	String name;

}
