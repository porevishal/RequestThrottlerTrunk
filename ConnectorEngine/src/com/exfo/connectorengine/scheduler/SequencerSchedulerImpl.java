package com.exfo.connectorengine.scheduler;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SequencerSchedulerImpl implements SequencerScheduler{
	
	//private ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
	
	public SequencerSchedulerImpl() {
	}

	@Override
	public void scheduleSequencerTask(List<SequencerTask> sequencerTaskList) {
		ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
		
		for (SequencerTask sequencerTask : sequencerTaskList) {
			newSingleThreadScheduledExecutor.scheduleWithFixedDelay(sequencerTask, 0, 3, TimeUnit.SECONDS);
		}
		
	}

}
