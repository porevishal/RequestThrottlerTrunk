package com.exfo.connectorengine.protocol.blades;

import com.exfo.connectorengine.data.PROTOCOL;

public class ProtocolBladeFactory {
	
	public static ProtocolBlade getProtocolBladeInstance(PROTOCOL protocol) {
		
		if(protocol.equals(PROTOCOL.HTTP)) {
			
			return new HttpProtocolBlade();
			
		}
		
		else if(protocol.equals(PROTOCOL.FTP)) {
			return new FtpProtocolBlade();
		}
		
		else {
			//default 
			return new HttpProtocolBlade();
		}
		
	}

}
