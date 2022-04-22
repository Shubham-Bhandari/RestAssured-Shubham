package Oauth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Authorization {

	@Test
	public void postTweet() 
	{
		Response response= RestAssured.given()
				.auth()
				.oauth("", "", "" , "")
				.post();
	}
}
