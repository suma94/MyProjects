package com.suma.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.suma.Array;

public class ArrayTest {

	Array a;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new Array();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void test() {
		int [] ar={-2,-1,-3,-4,-5};
		assertEquals(-1, a.findLarge(ar));
	}

}
