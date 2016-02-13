package com.exfo.connectorengine.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.exfo.connectorengine.data.PROTOCOL;
import com.exfo.connectorengine.data.Sequence;

public class SequencerDao {
	
	public List<Sequence> getSequences(int sequenceId) {
		ArrayList<Sequence> sequencers = new ArrayList<Sequence>(5);
		sequencers.add(new Sequence(true, "http://www.example.com", 10, 1, false, PROTOCOL.HTTP));
		sequencers.add(new Sequence(true, "http://www.test.com", 10, 2, false, PROTOCOL.FTP));
		//sort according to priorities
		Collections.sort(sequencers);
		return sequencers;
	}

}
