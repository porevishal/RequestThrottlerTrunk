package com.vishal.async.queue;

import java.util.concurrent.atomic.AtomicLong;

import com.vishal.async.data.IMessage;

public class QueueManager {
	
	QueueDataStructure queueDataStructure = QueueDataStructure.getQueueDataStructureInstance();
	AtomicLong numberOfLoginThreads = new AtomicLong();
	QueueExecutorService executorService = new QueueExecutorService();
	
	public void handOverMessageToExecutor() throws InterruptedException {
		
		//no login requests
		if(numberOfLoginThreads.get() == 0) {
			
			while(true) {
				IMessage elementsFromTheQueue = queueDataStructure.removeElementsFromTheQueue();
				executorService.processMessages(elementsFromTheQueue);
			}
			
		}else {
			System.out.println("Handing over messages stalled because of LOGIN inturruption");
		}
	}
	
	public void processLoginRequest() {
		numberOfLoginThreads.incrementAndGet();
	}

}
