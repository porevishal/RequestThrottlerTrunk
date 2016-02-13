package com.vishal.builder;

public enum Essence {

	VANILLA(0), BUTTER(1), STRAWBERRY(2);

	int shelfNumber;

	private Essence(int shelfNumber) {
		this.shelfNumber = shelfNumber;
	}

	public int getOrdinal(Essence essence) {

		return essence.shelfNumber;
	}

}
