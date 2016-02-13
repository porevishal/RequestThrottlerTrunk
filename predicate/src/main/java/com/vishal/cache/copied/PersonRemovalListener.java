package com.vishal.cache.copied;

import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

public class PersonRemovalListener implements RemovalListener<String,Person>{

	
	public void onRemoval(RemovalNotification notification) {
		System.out.println("Person associated with the key("+
				notification.getKey()+ ") is removed.");
	}
}
