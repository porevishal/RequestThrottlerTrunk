package com.vishal.cache.copied;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;

public class PersonCache {

	LoadingCache<String, Person> cache;

	PersonCacheLoader loader;
	
	PersonRemovalListener listener;
	
	public void init(){
		cache = CacheBuilder.newBuilder().
				maximumSize(100).
				expireAfterAccess(10, TimeUnit.SECONDS).
				removalListener(listener).
				build(loader);
	}

	public Person get(String key) throws ExecutionException{
		return cache.get(key);
	}
}
