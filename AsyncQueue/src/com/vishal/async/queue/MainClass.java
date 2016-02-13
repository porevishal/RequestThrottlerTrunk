package com.vishal.async.queue;

import com.vishal.async.data.Message;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		QueueDataStructure queueDataStructure = QueueDataStructure.getQueueDataStructureInstance();
		
		QueueExecutorService queueExecutorService = new QueueExecutorService();
		queueExecutorService.processMessages();
		
		queueDataStructure.insertElementsInTheQueue(new Message("Yahoo.."));
		Thread.sleep(5000);
		
		queueDataStructure.insertElementsInTheQueue(new Message("Google.."));
		Thread.sleep(5000);
		
		queueExecutorService.stopExecutorService();

		queueDataStructure.insertElementsInTheQueue(new Message("AOL.."));
		Thread.sleep(5000);

		queueDataStructure.insertElementsInTheQueue(new Message("APPLE.."));
		Thread.sleep(5000);

		queueDataStructure.insertElementsInTheQueue(new Message("Samsung.."));
		Thread.sleep(5000);

		queueDataStructure.insertElementsInTheQueue(new Message("Facebook.."));
		Thread.sleep(5000);

		queueDataStructure.insertElementsInTheQueue(new Message("WhatsApp.."));
		Thread.sleep(5000);


	}

}
