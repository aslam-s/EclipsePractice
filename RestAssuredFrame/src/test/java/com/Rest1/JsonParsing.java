package com.Rest1;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonParsing {
//	@Test(priority = 1)
	void testJsonParsing() {
//APPRAOCH 1
		/*
		 * given().contentType("contentType.JSON").when().get(
		 * "https://reqres.in/api/users?page=2").then().statusCode(200)
		 * .header("content-Type", "application/json; charset=utf-8")
		 * .body("data[4].email", equalTo("george.edwards@reqres.in"));
		 */
		// APPRAOCH 2
		Response res = given().contentType("contentType.JSON").when().get("https://reqres.in/api/users?page=2");
		Assert.assertEquals(res.getStatusCode(), 200); // validation
		Assert.assertEquals(res.getHeader("content-Type"), "application/json; charset=utf-8"); // validation 2

		String ename = res.jsonPath().get("data[4].email").toString();
		Assert.assertEquals(ename, "george.edwards@reqres.in");
	}

	@Test(priority = 2)
	void testJsonResponseBody() {

		// APPRAOCH 2
		// Response res =
		// given().contentType("contentType.JSON").when().get("https://reqres.in/api/users?page=2");
		/*
		 * Assert.assertEquals(res.getStatusCode(), 200); // validation
		 * Assert.assertEquals(res.getHeader("content-Type"),
		 * "application/json; charset=utf-8"); // validation 2
		 * 
		 * String ename = res.jsonPath().get("data[4].email").toString();
		 * Assert.assertEquals(ename, "george.edwards@reqres.in");
		 */
		Response res = given().contentType(ContentType.JSON).when().get("https://reqres.in/api/users?page=2");
		// JSONObject Class
		JSONObject jo = new JSONObject(res.toString()); // converting response to json object type
		for (int i = 0; i < jo.getJSONArray("data").length(); i++) {
			String etitle = jo.getJSONArray("data").getJSONObject(i).get("email").toString();
			System.out.println(etitle);

		}
	}
}
