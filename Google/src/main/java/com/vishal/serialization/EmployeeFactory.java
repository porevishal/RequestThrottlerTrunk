package com.vishal.serialization;

public class EmployeeFactory {
	
	public static Employee getInstance(String name, int age) throws IllegalArgumentException {
		
		if(age >150) throw new IllegalArgumentException("OverAge");
		
		Employee employee = (age > 100) ? new Employee("Too Old", age) : new Employee(name, age);
		
		System.out.println("Creating Employee Object"+employee);
		
		return employee;
		
	}

}
