package restassuredproject;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


import org.testng.annotations.Test;


public class HamcrestMatchers {
	
	@Test
	public void checkleagueId() {
		
		get("http://localhost:3000/team").then().body("resources.leagueId", equalTo(35));	
		
	}
	
	@Test
	public void checkapiversion() {
		
		get("http://localhost:3000/team").then().body("resources.apiVersion", equalTo("2020-05-01"));
	}
	
	
	@Test
	public void checkprice() {
		
		get("http://localhost:3000/team").then().body("odds.price", equalTo(1.35F));
	}
	
	
	
	
	
	
	
	
	

}
