package com.assertionclass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardASsertion {
	@Test
	private void testz() {
		System.out.println("testing1");
		System.out.println("testing2");
		// hard
		Assert.assertEquals(1, 2);
		System.out.println("testing3");

	}
}
