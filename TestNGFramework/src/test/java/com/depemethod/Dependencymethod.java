package com.depemethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencymethod {
	@Test(priority = 1)
	void openapp() {
		Assert.assertTrue(true);
	}

	@Test(priority = 2, dependsOnMethods = { "openapp" })
	void login() {
		Assert.assertTrue(true);
	}

	@Test(priority = 3, dependsOnMethods = { "login" })
	void search() {
		Assert.assertTrue(false);
	}

	@Test(priority = 4)
	void adsearch() {                 
		Assert.assertTrue(true);
	}

	@Test(priority = 5)
	void logout() {
		Assert.assertTrue(false);
	}
}
