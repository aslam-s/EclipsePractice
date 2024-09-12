package com.Rest1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class HeaderDemo {
//	@Test(priority = 1)
	void testheader() {
		given().when().get("https://www.google.com/").then().header("Content-Type", "text/html; charset=ISO-8859-1")
				.header("Content-Encoding", "gzip").log().all();
	}

	@Test(priority = 2)
	void testgetheader() {
		Response res = given().when().get("https://www.google.com/");
		// get single header info
		// String h = res.getHeader("content-Type");
		// System.out.println(h);
		// get all headers info
		Headers hs = res.getHeaders();
		for (Header hd : hs) {
			System.out.println(hd.getName() + "    " + hd.getValue());

		}

	}

}
