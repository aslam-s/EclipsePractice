package com.Rest1;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class FakerDataGenerator {
	@Test
	void testDummydata() {
		Faker f = new Faker();
		String fulln = f.name().fullName();
		String fname = f.name().firstName();
		String lname = f.name().lastName();
		String uname = f.name().username();
		String spass = f.internet().password();
		String cphone = f.phoneNumber().cellPhone();
		String semail = f.internet().safeEmailAddress();
		System.out.println(fulln);
		System.out.println(fname);
		System.out.println(lname);
		System.out.println(uname);
		System.out.println(spass);
		System.out.println(cphone);
		System.out.println(semail);
	}
}
