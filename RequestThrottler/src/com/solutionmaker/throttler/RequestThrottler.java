package com.solutionmaker.throttler;

import java.security.PrivilegedAction;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RequestThrottler {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<Object> callable = Executors.callable(new PrivilegedAction<Integer>() {

			@Override
			public Integer run() {
				return 2;
			}
		});
		
		Callable<Object> callable2 = Executors.callable(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("This is test implementation");
				
			}
		});
		
		
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(1);
		Future<Object> future = newFixedThreadPool.submit(callable);
		
		while(!future.isDone()) {
			Thread.sleep(3000);
		}
		
		System.out.println(future.get().toString());
		
		Future<Object> submit = newFixedThreadPool.submit(callable2);
		
		while(!submit.isDone()) {
			Thread.sleep(3000);
		}
		
		System.out.println(submit.get().toString());
		
		Callable<String> callable3 = new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		 Future<String> submit2 = newFixedThreadPool.submit(callable3);
				
				while(!submit2.isDone()) {
					Thread.sleep(3000);
				}
		System.out.println(submit2.get());
	}

}
