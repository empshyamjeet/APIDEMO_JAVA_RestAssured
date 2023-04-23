package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;

public class PostApisTests {
	
	
	@Test
	public void test1() {
		
		JSONObject request = new JSONObject();
		request.put("name", "chaya");
		request.put("job", "BA");

		System.out.println(request);
		System.out.println(request.toString());

		given().
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().statusCode(201 );

	}

}
