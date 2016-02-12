package com.vishal.bloch;

import java.util.ArrayList;
import java.util.List;

/**
 * Item 25 - Prefer Lists to Array
 * 
 * @author Vishal
 * 
 */

public class ListOverArray {
	
	private Orange defaultOrange = new Orange();
	private Orange nagpurOrange = new Orange("Nagpur");
	//private NonFruit nonFruit = new NonFruit();

	public static void main(String[] args) {
		// Arrays are covariant
		ListOverArray lOverArray = new ListOverArray();

		lOverArray.arraysAreCovariant();
		lOverArray.genericsAreInvariant();

	}

	private void arraysAreCovariant() {

		Fruit[] fruitArray = new Orange[3];
		fruitArray[0] = defaultOrange;
		fruitArray[1] = nagpurOrange;
		//fruitArray[2] = nonFruit;
		// fruitArray[2] = new Fruit();

		System.out
				.println("Element of Fruit Array- " + fruitArray[0]);
		System.out
				.println("Element of Fruit Array- " + fruitArray[1]);
		// System.out.println("Element of Fruit Array- " +
		// fruitArray[2].getName());
	}
	
	private void genericsAreInvariant() {
		
		//The below does not work
		//List<Fruit> listOfFruits = new ArrayList<Orange>();
		
		//This works
		List<Fruit> listOfFruits = new ArrayList<Fruit>();
		listOfFruits.add(defaultOrange);
		listOfFruits.add(nagpurOrange);
		//below does not work
		//listOfFruits.add(nonFruit);
		
		System.out.println("List Of Fruits "+listOfFruits.get(0));
	}

	class Fruit {
		private String name = "Fruit";

		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return getName();
		}

	}

	class Orange extends Fruit {

		private String name = "Santra";

		Orange(String name) {

			this.name = name;
		}

		Orange() {

		}

		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return getName();
		}

	}
	
	class NonFruit{
		
	}

}
