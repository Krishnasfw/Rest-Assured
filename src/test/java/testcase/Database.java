package testcase;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Database {
	
	@Test
	public void Test() {
		
		baseURI = "http://localhost:3000/";
		
		given().get("/employees").then().statusCode(200).log().all()
;
		
	}
@Test

	public void POST_METHOD2(){
			
		JSONObject request = new JSONObject();
		
		request.put("first_name", "Vignesh");
		request.put("last_name", "Tester");
		request.put( "ph.no","000000000");
		
	//	System.out.println(request);
	  given().header("Content-Type","application/json").accept(ContentType.JSON).contentType(ContentType.JSON).
	  body(request.toJSONString()).
		when().post("/employees"). 
		then().statusCode(201).log().all();
}

@Test
public void Dele() {
	baseURI = "http://localhost:3000/";	
	when().delete("/employees/4").
	then().statusCode(200).log().all();
	
}

}