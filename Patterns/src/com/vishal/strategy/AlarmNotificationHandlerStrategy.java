package com.vishal.strategy;

public class AlarmNotificationHandlerStrategy implements INotificationHandlerStrategy {

	@Override
	public void handleNotification() {
		System.out.println("Alarm Notification Handler...");
	}

}
