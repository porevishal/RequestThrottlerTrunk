package com.solutionmaker.throttler.rejection.handler;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class AbstractRejectionHandler implements RejectedExecutionHandler {
	
	//TODO -will provide concrete implementation here
	public abstract void logRejectionDetails(Runnable task);
	
	//TODO -provide concrete implementation here
	public abstract void updateDatabase(Runnable task);
	
	//This will be abstract all the time
	public abstract void handleRejection(Runnable task);
	
	@Override
	public void rejectedExecution(Runnable task, ThreadPoolExecutor executor) {
		
		//log first
		logRejectionDetails(task);
		
		//update the database with details
		updateDatabase(task);
		
		//handle rejection
		handleRejection(task);
		
		
		
		
		
		
	}

}
