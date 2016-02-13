package com.vishal.basics;

public enum TrialEnum {
	
	ONE(11), TWO(22);
	
	private int ordinal;
	
	private TrialEnum(int ordinal) {
		this.ordinal = ordinal;
	}
	
	public int getOrdinal() {
		return ordinal;
	}

}
