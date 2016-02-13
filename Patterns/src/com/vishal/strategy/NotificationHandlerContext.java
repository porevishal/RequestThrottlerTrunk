package com.vishal.strategy;

public class NotificationHandlerContext {

	public static void handleNotification(INotification notification) {

		if (notification instanceof CreateNotification) {

			new CreateNotificationHandlerStrategy().handleNotification();

		} else if (notification instanceof DeleteNotification) {

			new DeleteNotificationHandlerStrategy().handleNotification();

		} else if (notification instanceof AlarmNotification) {

			new AlarmNotificationHandlerStrategy().handleNotification();
		}

	}

}
