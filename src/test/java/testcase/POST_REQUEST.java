package testcase;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class POST_REQUEST {

	@Test 
	public void POST_METHOD1() {
		
		Map<String, Object> map =new HashMap<String, Object>();
		
		map.put("name", "Manoj");
		map.put("role", "Tester");
		System.out.println(map);
	}
	
	@Test
	public void POST_METHOD2(){
		
		JSONObject request = new JSONObject();
		
		request.put("name", "Manoj");
		request.put("role", "Tester");
		
		System.out.println(request);
	  given().
	  body(request.toJSONString()).
		when().post("https://reqres.in/api/users?page=2"). 
		then().statusCode(201).log().all();
	  
	}
	
	@Test
	public void PATCH() {
JSONObject request = new JSONObject();
		
		request.put("name", "Krishna");
		request.put("role", "QA");
		
		System.out.println(request);
	  given().
	  body(request.toJSONString()).
		when().patch("https://reqres.in/api/users/87"). 
		then().statusCode(200).log().all();
		
	}
	
	@Test
	public void DELETE()
{
		
when().delete("https://reqres.in/api/users/87").
then().statusCode(204).log().all();
}
}
