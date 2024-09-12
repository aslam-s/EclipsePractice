package com.first;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Firstclasstest {
	@Test
	private void testing1() {
		System.out.println("test1");
	}

	@BeforeClass
	private void testing2() {
		System.out.println("test1");
	}

	@AfterClass
	private void testing3() {
		System.out.println("test1");
	}
}
