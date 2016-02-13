package com.vishal.async.queue;

import java.util.LinkedList;
import java.util.Queue;

import com.vishal.async.data.IMessage;

public class QueueDataStructure {
	
	private Queue<IMessage> nonBockingQueue = new LinkedList<IMessage>();
	
	private QueueDataStructure() {
		// Do nothing
	}
	
	private static final QueueDataStructure INSTANCE = new QueueDataStructure();
	
	public void insertElementsInTheQueue(IMessage mssg) {
		nonBockingQueue.add(mssg);
	}
	
	public IMessage removeElementsFromTheQueue() {
		return nonBockingQueue.poll();
	}
	
	public static QueueDataStructure getQueueDataStructureInstance() {
		return INSTANCE;
	}

}
