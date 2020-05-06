package base;



import base.CustomMethods;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CustomMethods {

	public Response getRequest(String url, String endpoint) {
		
		RestAssured.baseURI =url;
        //Define the specification of request. Server is specified by baseURI above.
        RequestSpecification httpRequest = RestAssured.given();
 
        //Makes calls to the server using Method type.
        return httpRequest.request(Method.GET, endpoint);
	}

	
}
