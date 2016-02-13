package com.vishal.async.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.vishal.async.data.IMessage;

public class QueueDataStructure {
	
	private BlockingQueue<IMessage> blockingQueue = new LinkedBlockingQueue<IMessage>();
	
	private QueueDataStructure() {
		// Do nothing
	}
	
	private static final QueueDataStructure INSTANCE = new QueueDataStructure();
	
	public void insertElementsInTheQueue(IMessage mssg) {
		blockingQueue.add(mssg);
	}
	
	public IMessage removeElementsFromTheQueue() throws InterruptedException {
		return blockingQueue.take();
	}
	
	public static QueueDataStructure getQueueDataStructureInstance() {
		return INSTANCE;
	}

}
