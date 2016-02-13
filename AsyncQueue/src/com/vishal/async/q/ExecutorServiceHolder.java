package com.vishal.async.q;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.vishal.async.data.IMessage;

public class ExecutorServiceHolder {

	private ExecutorService executorService = Executors.newSingleThreadExecutor();

	public void processQueue(IMessage message) {
		executorService.submit(new Task(message));

	}

    public void shutdownExecutorService() {
    	executorService.shutdown();
    }
}
