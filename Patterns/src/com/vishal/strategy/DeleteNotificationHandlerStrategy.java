package com.vishal.strategy;

public class DeleteNotificationHandlerStrategy implements INotificationHandlerStrategy{

	@Override
	public void handleNotification() {
		System.out.println("Delete Notification handler....");
	}

}
