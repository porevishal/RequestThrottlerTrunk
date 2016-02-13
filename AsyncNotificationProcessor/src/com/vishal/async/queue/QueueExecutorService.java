package com.vishal.async.queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.vishal.async.data.IMessage;

public class QueueExecutorService {

	public QueueExecutorService() {
		super();
	}

	private ExecutorService executor = Executors.newSingleThreadExecutor();

	public void processMessages(IMessage message) {

		final IMessage mssg = message;
		executor.submit(new Runnable() {

			@Override
			public void run() {
				
					System.out.println("Printing message "+mssg);
				}
		});
	}
	
	public void stopExecutorService() {
		try {
			System.out.println(executor.awaitTermination(10, TimeUnit.SECONDS));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
