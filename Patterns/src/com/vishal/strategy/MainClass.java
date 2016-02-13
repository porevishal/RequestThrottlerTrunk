package com.vishal.strategy;

public class MainClass {
	
	private static NotificationHandler notificationHandler = new NotificationHandler();

	public static void main(String[] args) {

		CreateNotification createNotification = new CreateNotification();
		DeleteNotification deleteNotification = new DeleteNotification();
		AlarmNotification alarmNotification = new AlarmNotification();
		
		notificationHandler.handleNotification(createNotification);
		notificationHandler.handleNotification(alarmNotification);
		notificationHandler.handleNotification(deleteNotification);
		
		

	}

}
