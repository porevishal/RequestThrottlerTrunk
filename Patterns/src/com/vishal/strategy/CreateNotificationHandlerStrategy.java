package com.vishal.strategy;

public class CreateNotificationHandlerStrategy implements INotificationHandlerStrategy {

	@Override
	public void handleNotification() {
		System.out.println("Create Notification....");
	}

}
