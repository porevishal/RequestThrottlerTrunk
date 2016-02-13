package com.vishal.async.queue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class QueueExecutorService {

	private ExecutorService executor = Executors.newSingleThreadExecutor();
	private QueueDataStructure queueDataStructure = QueueDataStructure
			.getQueueDataStructureInstance();

	public void processMessages() {

		executor.execute(new Runnable() {

			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(queueDataStructure
							.removeElementsFromTheQueue());
				}
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
