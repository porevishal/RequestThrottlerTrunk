package com.vishal.builder;

public class CakeMaker {

	public static void main(String[] args) {

		Cake cake = new Cake.CakeBuilder().addCashew(2).addEggs(55).buildCake();
		System.out.println("Delicious " + cake);

	}

}
