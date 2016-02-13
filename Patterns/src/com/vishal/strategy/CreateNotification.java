package com.vishal.strategy;

public class CreateNotification implements INotification {
	
	private String type = "Create";

	@Override
	public String getTypes() {
		return type;
	}

}
