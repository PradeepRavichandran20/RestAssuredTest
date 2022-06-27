package restassuredproject;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;

public class GetResponseSample {

	@Test
	public void GetSampleOne() {
		
		
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		
		ResponseBody responseBody = response.body();
		
		System.out.println(responseBody.asPrettyString());
	}
	
	@Test
	public void GetSampleTwo() {
		
		RestAssured.baseURI="https://reqres.in/api/";
		
		ValidatableResponse response = RestAssured
			.given()
				.param("", "")
				.header("", "")
			.when()
			    .get("/users/2")
			 .then()
                 .statusCode(200);	
		
	}
		


}
