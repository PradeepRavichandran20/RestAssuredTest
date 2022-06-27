package restassuredproject;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;



public class SampleRequestPost {
	
	
	@Test
	public void samplePost() {
		
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("name", "rach");
		jsonobject.put("job", "engineer");
		
		System.out.println(jsonobject.toString());
		
		RestAssured.baseURI="https://reqres.in";
		
		RestAssured
		.given()
		  .header("","")
		  .body(jsonobject.toJSONString())
		  .post("/api/users")
		  .then()
		     .statusCode(201);
		
	}

}
