package com.exfo.connectorengine.data;

import java.io.Serializable;

/**
 * Sequencer object representing the Sequencer row(s) in the database
 * @author Vishal
 *
 */
public class Sequence implements Serializable, Comparable<Sequence>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2870337403053868937L;
	private final boolean isPeriodic;
	private final String urlString;
	private final int schedulePeriod;
	private final int priority;
	private final boolean isDaisyChained;
	private final PROTOCOL protocol;
	
	
	public Sequence(boolean isPeriodic, String urlString, int schedulePeriod,
			int priority, boolean isDaisyChained, PROTOCOL protocol) {
		super();
		this.isPeriodic = isPeriodic;
		this.urlString = urlString;
		this.schedulePeriod = schedulePeriod;
		this.priority = priority;
		this.isDaisyChained = isDaisyChained;
		this.protocol = protocol;
	}


	@Override
	public String toString() {
		return "Sequence [isPeriodic=" + isPeriodic + ", urlString="
				+ urlString + ", schedulePeriod=" + schedulePeriod
				+ ", priority=" + priority + ", isDaisyChained="
				+ isDaisyChained + ", protocol=" + protocol + "]";
	}


	@Override
	public int compareTo(Sequence o) {
		//TODO this needs correction
		if(this.priority > o.priority) {
			return 1;
		}else if(this.priority < o.priority) {
			return -1;
		}
		
		return 0;
	}


	public boolean isPeriodic() {
		return isPeriodic;
	}


	public String getUrlString() {
		return urlString;
	}


	public int getSchedulePeriod() {
		return schedulePeriod;
	}


	public int getPriority() {
		return priority;
	}


	public boolean isDaisyChained() {
		return isDaisyChained;
	}


	public PROTOCOL getProtocol() {
		return protocol;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isDaisyChained ? 1231 : 1237);
		result = prime * result + (isPeriodic ? 1231 : 1237);
		result = prime * result + priority;
		result = prime * result
				+ ((protocol == null) ? 0 : protocol.hashCode());
		result = prime * result + schedulePeriod;
		result = prime * result
				+ ((urlString == null) ? 0 : urlString.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sequence other = (Sequence) obj;
		if (isDaisyChained != other.isDaisyChained)
			return false;
		if (isPeriodic != other.isPeriodic)
			return false;
		if (priority != other.priority)
			return false;
		if (protocol != other.protocol)
			return false;
		if (schedulePeriod != other.schedulePeriod)
			return false;
		if (urlString == null) {
			if (other.urlString != null)
				return false;
		} else if (!urlString.equals(other.urlString))
			return false;
		return true;
	}
	
	
	
		

}
