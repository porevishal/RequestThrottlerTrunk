package com.vishal.singleton;


public class TestClass {
	MyClass myClass = new MyClass(10) {
		public String toString() {
			System.out.println("This is crap");
			//yahoo();
			return "Crappy Code";
		}
		
		public void yahoo() {
			System.out.println("Yahoo");
		}
	};
	
	public void lifeSucks() {
		System.out.println(myClass.toString());
	}
	

}
