package APITests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

public class DeleteApisTests {
	
	
	@Test
	public void test1() {
		
		JSONObject request = new JSONObject();
		given().
		body(request.toJSONString()).
		when().
		delete("https://reqres.in/api/users/2").
		then().statusCode(204).
		log().all();


	}

}
