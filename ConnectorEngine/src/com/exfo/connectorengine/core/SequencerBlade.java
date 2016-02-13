package com.exfo.connectorengine.core;

import com.exfo.connectorengine.scheduler.SequencerScheduler;

public class SequencerBlade {

	private final SequencerScheduler sequencerScheduler;

	public SequencerScheduler getSequencerScheduler() {
		return sequencerScheduler;
	}

	public SequencerBlade(SequencerScheduler sequencerScheduler) {
		this.sequencerScheduler = sequencerScheduler;
	}

}
