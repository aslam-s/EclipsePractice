package com.testn;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotatiomnAll {
	@BeforeMethod
	void bm() {
		System.out.println("This is before method");
	}

	@AfterMethod
	void am() {
		System.out.println("This is After method");
	}

	@BeforeClass
	void bc() {
		System.out.println("This is before Class");
	}

	@AfterClass
	void ac() {
		System.out.println("This is after class");
	}

	@Test
	void test1() {
		System.out.println("This is  test");
	}

	@Test
	void test2() {
		System.out.println("This is  test 2");
	}

	@BeforeTest
	void bt() {
		System.out.println("This is before test");
	}

	@AfterTest
	void at() {
		System.out.println("This is after test");
	}

	@BeforeSuite
	void bsu() {
		System.out.println("This is before suite");
	}

	@AfterSuite
	void asu() {
		System.out.println("This is after suite");
	}
}
