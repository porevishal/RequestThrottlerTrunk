package com.vishal.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainClass {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
		Future<Boolean> submit = newSingleThreadExecutor.submit(new CallableExample());
		//Executors.newSingleThreadExecutor().submit(new Thread() {@Override public void run() {};};);
		System.out.println("Retured Value is "+submit.get());
		newSingleThreadExecutor.shutdown();

	}

}
