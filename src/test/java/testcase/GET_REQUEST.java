package testcase;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GET_REQUEST {
	
	@Test 
	public void Testcase() {
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());  
		//System.out.println(response.getBody());
		System.out.println(response.asString());
		System.out.println(response.getContentType());
		
	}
	
	@Test
	public void GET_REQ02() {
		given().header("Content-Type","application/json").
		when().get("https://reqres.in/api/users?page=2"). 
		then().statusCode(200);
		
	}

}
