package com.vishal.strategy;

public class DeleteNotification implements INotification {
	
	private String type = "Delete";

	@Override
	public String getTypes() {
		return type;
	}

}
