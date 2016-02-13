package com.vishal.persistence;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class EmailDaoTest extends TestCase {
	
	@Before
	public static void beforeMethod() {
		System.out.println("Before Each Method executed...");
	}
	
	@BeforeClass
	public static void beforeClassMethod() {
		System.out.println("Should be run just once...");
	}
	
	@Test
	public void testSimpleLogic() {
		
		int a = 10;
		int b = 10;
		System.out.println("yahoo");
		assertTrue(a==b);
	}
	
	@Test
	public void testSimplerLogic() {
		int a = 5;
		int b =6;
		
		assertFalse((a+b) == 0);
	}

}
