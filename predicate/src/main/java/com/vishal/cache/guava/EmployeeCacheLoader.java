package com.vishal.cache.guava;

import com.google.common.cache.CacheLoader;


public class EmployeeCacheLoader extends CacheLoader<String, Employee> {
	

	@Override
	public Employee load(String key) throws Exception {
		
		return EmployeeSerializer.deSerialize(key);
		
	}

}
