package com.suma.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ArrayRun {

	public static void main(String[] args) {
		Result r = JUnitCore.runClasses(ArrayTest.class);
		System.out.println(""+r.wasSuccessful());

	}

}
