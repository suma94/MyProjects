package com.suma.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.suma.Class1;

public class Class1Test1 {

	@Test
	public void testSub() {
		Class1 c = new Class1();
		assertEquals(1, c.sub(3,2));
	}

}
