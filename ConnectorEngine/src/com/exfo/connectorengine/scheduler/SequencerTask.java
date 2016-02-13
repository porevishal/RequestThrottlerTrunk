package com.exfo.connectorengine.scheduler;

import com.exfo.connectorengine.data.Sequence;
import com.exfo.connectorengine.protocol.blades.ProtocolBladeFactory;

public class SequencerTask implements Runnable{
	
	private Sequence sequence;
	
	public SequencerTask(final Sequence sequence) {
		
		this.sequence = sequence;
		
	}

	@Override
	public void run() {
		
		//Core Business logic of hitting the remote servers for data. This Task is agnostic to the protocol implementation
		//Get the correct blade from the factory and hit the remote server
		System.out.println(sequence+" executed by "+ProtocolBladeFactory.getProtocolBladeInstance(sequence.getProtocol()));
		
	}

}
