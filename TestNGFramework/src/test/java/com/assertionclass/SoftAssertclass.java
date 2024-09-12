package com.assertionclass;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertclass {
	@Test
	private void testz() {
		System.out.println("testing1");
		System.out.println("testing2");
		// SoftAssertion

		SoftAssert as = new SoftAssert();// soft assertion
		as.assertEquals(1, 2);
		System.out.println("testing3");
		as.assertAll();// mandatory
	}
}
