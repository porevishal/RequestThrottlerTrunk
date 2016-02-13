package com.vishal.immutable;

public final class SampleImmutableClass {

	private final int state1;
	private final int state2;

	private SampleImmutableClass(int state1, int state2) {

		this.state1 = state1;
		this.state2 = state2;

	}

	public int getState1() {
		return state1;
	}

	public int getState2() {
		return state2;
	}

	public SampleImmutableClass getImmutableClass(int state1, int state2) {

		return new SampleImmutableClass(state1, state2);

	}

}
