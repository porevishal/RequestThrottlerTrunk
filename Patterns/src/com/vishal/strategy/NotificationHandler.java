package com.vishal.strategy;

public class NotificationHandler {
	
	
	public void handleNotification(INotification notification) {
		
		NotificationHandlerContext.handleNotification(notification);
		
	}

}
