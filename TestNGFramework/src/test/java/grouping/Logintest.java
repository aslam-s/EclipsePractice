package grouping;

import org.testng.annotations.Test;

public class Logintest {
	@Test(priority = 1, groups = { "sanity" })
	void loginbyemail() {
		System.out.println("Login by email");

	}

	@Test(priority = 2, groups = { "sanity" })
	void loginbyfacebook() {
		System.out.println("Login by facebook");

	}

	@Test(priority = 3, groups = { "sanity" })
	void loginbytwitter() {
		System.out.println("Login by twitter");

	}
}
