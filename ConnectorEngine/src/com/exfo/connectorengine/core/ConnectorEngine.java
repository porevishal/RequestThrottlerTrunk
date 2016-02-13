package com.exfo.connectorengine.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.exfo.connectorengine.data.Sequence;
import com.exfo.connectorengine.scheduler.SequencerSchedulerImpl;
import com.exfo.connectorengine.scheduler.SequencerTask;

public class ConnectorEngine {

	//TODO - The Scheduler Implementation can come from a factory.
	private final SequencerBlade sequencerBlade = new SequencerBlade(new SequencerSchedulerImpl());
	
	private static final ConnectorEngine connectorEngine = new ConnectorEngine();

	private ConnectorEngine() {
		
	}
	
	public void executeRequest(final List<Sequence> sequences) {
		
		List<SequencerTask> sequencerTaskList = new ArrayList<SequencerTask>(5);
		
		//sort the priorities of tasks
		Collections.sort(sequences);
		
		for (Sequence sequence : sequences) {
			sequencerTaskList.add(new SequencerTask(sequence));
		}
		
		sequencerBlade.getSequencerScheduler().scheduleSequencerTask(sequencerTaskList);
		
	}
	
	public static ConnectorEngine getInstance() {
		return connectorEngine;
	}

}
