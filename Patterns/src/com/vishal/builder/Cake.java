package com.vishal.builder;

public class Cake {

	private int whiteStuff = 10;
	private int eggs = 15;
	private int tuttiFrutti = 10;
	private int milkPowder = 1;
	private int cashew = 1;
	private Essence essence = Essence.VANILLA;

	private Cake(CakeBuilder cBuilder) {
		this.cashew = cBuilder.cashew;
		this.eggs = cBuilder.eggs;
		this.essence = cBuilder.essence;
		this.milkPowder = cBuilder.milkPowder;
		this.tuttiFrutti = cBuilder.tuttiFrutti;
		this.whiteStuff = cBuilder.whiteStuff;

	}

	@Override
	public String toString() {
		return "Cake [whiteStuff=" + whiteStuff + ", eggs=" + eggs
				+ ", tuttiFrutti=" + tuttiFrutti + ", milkPowder=" + milkPowder
				+ ", cashew=" + cashew + ", essence=" + essence + "]";
	}

	public static class CakeBuilder {

		private int whiteStuff = 10;
		private int eggs = 15;
		private int tuttiFrutti = 10;
		private int milkPowder = 1;
		private int cashew = 1;
		private Essence essence = Essence.VANILLA;

		public CakeBuilder() {
		}

		public CakeBuilder addWhiteStuff(int quantity) {
			this.whiteStuff = quantity;
			return this;
		}

		public CakeBuilder addEggs(int quantity) {
			this.eggs = quantity;
			return this;
		}

		public CakeBuilder addMilkPowder(int quantity) {
			this.milkPowder = quantity;
			return this;
		}

		public CakeBuilder addCashew(int quantity) {
			this.cashew = quantity;
			return this;
		}

		public CakeBuilder addTuttiFrutti(int quantity) {
			this.tuttiFrutti = quantity;
			return this;
		}

		public CakeBuilder addEssence(Essence essence) {

			this.essence = essence;
			return this;
		}

		public Cake buildCake() {

			return new Cake(this);
		}
	}

}
