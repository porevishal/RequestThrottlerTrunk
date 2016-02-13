package com.vishal.corepoolsize;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CorePoolSizeExample {
	
	
	public static void main(String[] args) throws InterruptedException {
		ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 20, TimeUnit.SECONDS, new PriorityBlockingQueue<Runnable>(), new ThreadPoolExecutor.CallerRunsPolicy());
		threadPoolExecutor.allowCoreThreadTimeOut(true);
		
		threadPoolExecutor.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Yahoo from "+Thread.currentThread());
			}
		});
		
		threadPoolExecutor.shutdown();
		
		threadPoolExecutor.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Google" +Thread.currentThread());				
			}
		});
		
		//threadPoolExecutor.awaitTermination(10, TimeUnit.SECONDS);
		
		
		
	}

}
