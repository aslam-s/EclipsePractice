package com.testn;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sampleclass {
	@BeforeClass
	void test1() {
		System.out.println("test 1");

	}

	@BeforeTest
	void test4() {
		System.out.println("test 4");

	}

	@Test(priority = 2)
	void test2() {
		System.out.println("test 2");

	}

	@Test(priority = 1)
	void test3() {
		System.out.println("test 3");
	}
}
