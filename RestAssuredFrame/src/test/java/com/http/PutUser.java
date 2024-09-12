package com.http;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class PutUser {
	@Test
	void post_test(ITestContext context) {

		Faker f = new Faker();
		JSONObject data = new JSONObject();
		data.put("name", f.name().fullName());
		data.put("gender", "Female");
		data.put("email", f.internet().emailAddress());
		data.put("status", "active");
		int id = (int) context.getSuite().getAttribute("user_id");

		String bt = "cc695d1c503f57f381f18d9932783192eddbbc72f3550fcbfd748f5ae4290479";
		given().headers("Authorization", "Bearer " + bt).contentType("application/json").pathParam("id", id)
				.body(data.toString()).when().put("https://gorest.co.in/public/v2/users/{id}").then().statusCode(200)
				.log().all();

	}
}
