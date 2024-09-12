package com.http;

import static io.restassured.RestAssured.given;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class GETuser {
	@Test
	void test_get(ITestContext context) {
		int id = (int) context.getSuite().getAttribute("user_id"); // this should come from createuser req
		String bt = "cc695d1c503f57f381f18d9932783192eddbbc72f3550fcbfd748f5ae4290479";

		given().headers("Authorization", "Bearer " + bt).pathParam("id", id).when()
				.get("https://gorest.co.in/public/v2/users/{id}").then().statusCode(200).log().all();

	}

}
