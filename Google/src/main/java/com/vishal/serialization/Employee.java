package com.vishal.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
	
	/**
	 * Random number
	 */
	private static final long serialVersionUID = 134L;

	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder(2);
		
		stringBuilder.append("[Name:");
		stringBuilder.append(getName());
		stringBuilder.append(" Age: ");
		stringBuilder.append(getAge());
		stringBuilder.append("]");
		
		return stringBuilder.toString();
	}

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	

}
