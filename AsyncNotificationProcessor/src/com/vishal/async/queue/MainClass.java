package com.vishal.async.queue;

import com.vishal.async.data.Message;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		
		QueueDataStructure queueDataStructure = QueueDataStructure.getQueueDataStructureInstance();
		
		queueDataStructure.insertElementsInTheQueue(new Message("Yahoo.."));
		
		queueDataStructure.insertElementsInTheQueue(new Message("Google.."));
		
		queueDataStructure.insertElementsInTheQueue(new Message("AOL.."));

		queueDataStructure.insertElementsInTheQueue(new Message("APPLE.."));

		queueDataStructure.insertElementsInTheQueue(new Message("Samsung.."));

		queueDataStructure.insertElementsInTheQueue(new Message("Facebook.."));

		queueDataStructure.insertElementsInTheQueue(new Message("WhatsApp.."));


		new QueueManager().handOverMessageToExecutor();
	}

}
