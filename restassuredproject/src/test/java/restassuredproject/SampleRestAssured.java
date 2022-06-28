package restassuredproject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleRestAssured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Response response = RestAssured.get("http://www.google.co.in");
		int statusCode = response.statusCode();
		String statusline = response.statusLine();
		
		System.out.println(statusCode);
		System.out.println(statusline);
		System.out.println("Tesr");


	}

}
	
