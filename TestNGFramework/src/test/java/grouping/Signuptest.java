package grouping;

import org.testng.annotations.Test;

public class Signuptest {
	@Test(priority = 1, groups = { "regression" })
	void signupemail() {
		System.out.println("sign by email");

	}

	@Test(priority = 1, groups = { "regression" })
	void signupfacebook() {
		System.out.println("sign by facebook");

	}

	@Test(priority = 1, groups = { "regression" })
	void signuptwitter() {
		System.out.println("sign by twitter");

	}
}
