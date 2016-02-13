package com.vishal.cache.copied;

import com.google.common.cache.CacheLoader;

public class PersonCacheLoader extends CacheLoader<String,Person>{
	
	PersonSerializer personSerializer;
	
	public Person load(String key) throws Exception {
		return personSerializer.deserialize(key);
	}
}
