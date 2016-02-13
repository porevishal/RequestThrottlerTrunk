package com.vishal.async.q;

import com.vishal.async.data.Message;


public class MainClass {
	
	private static ExecutorServiceHolder executorServiceHolder = new ExecutorServiceHolder();

	public static void main(String[] args) {
		
		executorServiceHolder.processQueue(new Message("prada1"));
		executorServiceHolder.processQueue(new Message("prada2"));
		executorServiceHolder.processQueue(new Message("prada3"));
		executorServiceHolder.processQueue(new Message("prada4"));
		executorServiceHolder.processQueue(new Message("prada5"));
		executorServiceHolder.processQueue(new Message("prada6"));
		executorServiceHolder.processQueue(new Message("prada7"));
		executorServiceHolder.processQueue(new Message("prada8"));
		executorServiceHolder.processQueue(new Message("prada9"));
		executorServiceHolder.processQueue(new Message("prada10"));
		
		System.out.println("Done with the crap");

	}

}
