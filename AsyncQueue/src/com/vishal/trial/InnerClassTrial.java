package com.vishal.trial;

public class InnerClassTrial {
	
	public InnerClassTrial() {
		ThisIsAInnerClass innerClass = new ThisIsAInnerClass();
		innerClass.thisTest();
	}

	private int counter = 50;
	
	public void getValue() {
		
	}
	
	private class ThisIsAInnerClass{
		
		public void thisTest() {
			System.out.println("This Test " +this);
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return Integer.toString(counter);
		}
		
	}

	public static void main(String[] args) {

		 new InnerClassTrial();

	}
	
	@Override
	public String toString() {
		return "Not what we quite expected "+Integer.toString(counter);
	}

}
