package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class demo {

	@Test
	public void testww() {
		 RestAssured.baseURI = "https://reqres.in/api/users/";
		 
	        //Define the specification of request. Server is specified by baseURI above.
	        RequestSpecification httpRequest = RestAssured.given();
	 
	        //Makes calls to the server using Method type.
	        Response response = httpRequest.request(Method.GET, "2");
	        System.out.println(response.asString());
	 
	        //Checks the Status Code
	        int statusCode = response.getStatusCode();
	        Assert.assertEquals(statusCode, 200);
	}
}
