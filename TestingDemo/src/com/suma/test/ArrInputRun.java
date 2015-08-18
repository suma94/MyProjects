package com.suma.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class ArrInputRun {

	public static void main(String[] args) {
	
		Result r = JUnitCore.runClasses(ArrInputTest.class);
		System.out.println(""+r.wasSuccessful());

	}

}
