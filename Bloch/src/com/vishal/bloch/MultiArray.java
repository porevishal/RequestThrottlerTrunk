package com.vishal.bloch;

public class MultiArray {

	public static void main(String[] args) {
		
		int[] intArray = new int[3];
		intArray[2]= 3;
		
		
		int[][] doubleArray = new int[2][2];
		
		doubleArray[0][0] = 1;
		doubleArray[0][1] = 2;
		doubleArray[1][0] = 1;
		doubleArray[1][1] = 2;
		
		int[][] doubleArrayHigherLimit = new int[3][3];
		
		doubleArrayHigherLimit[0][0] = 1;
		doubleArrayHigherLimit[0][1] = 2;
		doubleArrayHigherLimit[0][2] = 3;
		doubleArrayHigherLimit[1][0] = 4;
		doubleArrayHigherLimit[1][1] = 5;
		doubleArrayHigherLimit[1][2] = 6;
		doubleArrayHigherLimit[2][0] = 7;
		doubleArrayHigherLimit[2][1] = 8;
		doubleArrayHigherLimit[2][2] = 9;
		
		

	}

}
