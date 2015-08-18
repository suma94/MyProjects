package com.suma.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.suma.ArrInput;

public class ArrInputTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int [] l = {1,3,4,2,5};
		ArrInput ai = new ArrInput();
		ai.rotate(l);
		assertEquals(3,ai.rotate(l));
	}

}
