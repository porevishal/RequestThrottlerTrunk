package com.vishal.cache.guava;

import java.io.IOException;

import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

public class EmployeeCacheRemovalListener implements RemovalListener<String, Employee>{

	public void onRemoval(RemovalNotification<String, Employee> notification) {
		
		String key = notification.getKey();
		Employee employee = notification.getValue();
		
		//lets serialize it
		try {
			System.out.println("Removing Employee from the cache..."+key);
			EmployeeSerializer.serialize(key, employee);
		} catch (IOException e) {
			System.out.println("Exception while serializing");
		}
		
	}

}
