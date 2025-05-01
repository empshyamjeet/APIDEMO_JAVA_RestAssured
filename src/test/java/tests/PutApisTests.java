package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

public class PutApisTests {
	
	
	@Test
	public void test1() {

		JSONObject request = new JSONObject();
		request.put("name", "chaya");
		request.put("job", "BAA");
		System.out.println(request);
		System.out.println(request.toString());
		given().
		body(request.toJSONString()).
		when().
		put("https://reqres.in/api/users/2").
		then().statusCode(200);

	}

}
