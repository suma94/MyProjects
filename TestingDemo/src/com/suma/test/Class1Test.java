package com.suma.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.suma.Class1;

public class Class1Test {

	Class1 c;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class");
	}

	@Before
	public void setUp() throws Exception {
		c = new Class1();
		System.out.println("Memory Created");
	}

	@After
	public void tearDown() throws Exception {
		c = null;
		System.out.println("Memory Destroyed");
	}

	@Test(timeout=1000)
	//@Test(expected=ArithmeticException.class)//if we include this line, if there exists an exception then there will not be any errors
	public void testAdd() {
		assertEquals(5, c.add(2,3));
	}
	
	

}
