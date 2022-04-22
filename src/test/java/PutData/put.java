package PutData;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class put {
	
	@Test
	public void modifydata()
	{
		RequestSpecification request= RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json= new JSONObject();
		json.put("name", "shubham");
		json.put("job", "Automation Tester");

		
		request.body(json.toJSONString());
		Response response=request.put("https://reqres.in/api/users/2");
		//Response response=request.put("http://ss-provider-adapter-pickupp.integration.service/order");
		
		//int code= response.getStatusCode();
		//System.out.println("response code:"+ code);
		
		String data= response.asString();
		System.out.println("Data :"+ data);
		
		//Assert.assertEquals(code, 200);
		
	}

}
