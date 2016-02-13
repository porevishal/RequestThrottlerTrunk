package com.vishal.wait.notify;

public enum FRUITS {
	
	APPLE("RED", 200), ORANGE("SAFFRON",100);
	
	String color;
	int price;
	
	private FRUITS(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
