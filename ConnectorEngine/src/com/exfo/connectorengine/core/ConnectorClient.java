package com.exfo.connectorengine.core;

import com.exfo.connectorengine.dao.SequencerDao;

public class ConnectorClient {

	public static void main(String[] args) {
		
		ConnectorEngine connectorEngine = ConnectorEngine.getInstance();
		connectorEngine.executeRequest(new SequencerDao().getSequences(1));

	}

}
