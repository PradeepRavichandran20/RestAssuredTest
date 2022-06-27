package restassuredproject;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class RequestPutSample {
	
	
	@Test
	public void SamplePutExample() {
		
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("name", "rach");
		jsonobject.put("sex", "male");
		
		
		baseURI="https://reqres.in/";
		
		 given()
		.header("","")
		.when()
		.body(jsonobject.toJSONString())
		.patch("api/users/2")
		.then()
		  .statusCode(200);
	
	}
	
	@Test
	public void SampleDeleteExample() {
		
		baseURI="https://reqres.in/";
		 given()
		.header("","")
		.when()
		.delete("api/users/2")
		.then()
		   .statusCode(202);
		
	}

}
