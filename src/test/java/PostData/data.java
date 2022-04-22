package PostData;

import com.github.javafaker.Faker;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.File;

public class data {
	
	@Test
	public void test1()
	{
		File jsonData = new File("D:\\Shubham\\Rest Assured Demo Projects\\restAssuredFramework\\test1.json");
		RequestSpecification request= RestAssured.given();

		request.header("Content-Type","application/json");
		Response response = request.post("https://reqres.in/api/users");

		int code= response.getStatusCode();
		System.out.println("Status code:"+code);
		Assert.assertEquals(code, 201);



		
		//JSONObject json= new JSONObject();
		//json.put("name", "shubham");
		//json.put("job", "Tester");













		
		//request.body(json.toJSONString());
		//Response response=request.post("https://reqres.in/api/users");
	}
		
}
