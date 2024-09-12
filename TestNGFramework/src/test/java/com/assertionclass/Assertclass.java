package com.assertionclass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertclass {
	@Test
	private void Testcase() {
		String act = "opencart";
		String exp = "opencart";
		// Assert.assertEquals(act, exp);
		if (act.equals(exp)) {
			System.out.println("pass");
			Assert.assertTrue(true);
		} else {
			System.out.println("fail");
			Assert.assertTrue(false);
		}

	}
}
