package com.vishal.cache.guava;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;

public class EmployeeCache {
	
	LoadingCache<String, Employee> employeeCache = CacheBuilder.newBuilder()
			.maximumSize(100)
			.removalListener(new EmployeeCacheRemovalListener())
			.build(new EmployeeCacheLoader());
	
	//returns the Employee from the cache
	public Employee getEmployee(String key) {
		
		return employeeCache.apply(key);
	}

}
