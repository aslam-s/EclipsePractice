package com.Rest1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CookiesDEmo {
	// @Test(priority = 1)
	void testCookies() {
		given().when().get("https://www.google.com/").then()
				.cookie("AEC", "AVYB7cqXEYNj0AysZ4edi0VqU1PcsEk2H4NT_EE9Fqo7zcI7Hba1earLy3k")

				.log().all();
	}

	@Test(priority = 2)
	void testgetCookies() {
		Response res = given().when().get("https://www.google.com/");
		// get single cookies info
		// String c_values = res.getCookie("AEC");
		// System.out.println("cookies values is " + c_values);

		// get all cookies info
		Map<String, String> cookieall = res.getCookies();
		// System.out.println(cookieall.keySet());
		for (String k : cookieall.keySet()) {
			String c_values = res.getCookie(k);
			System.out.println(k + "     " + c_values);

		}
	}
}
