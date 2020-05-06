package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.CustomMethods;
import constants.Constants;
import io.restassured.response.Response;
import utils.Fileoperation;

public class UserMangTests {

	Fileoperation fileoperation = new Fileoperation();
	Constants constants = new Constants();
	CustomMethods customMethods = new CustomMethods();

	@BeforeTest
	public void startUp() {
		// RestAssured.baseURI =
		// fileoperation.getValueFromPropertyFile(constants.CONFIG_WEB_FILE_PATH,
		// "baseurl");
	}

	@Test
	public void getSingleUserDetails() {
		Response response = customMethods
				.getRequest(fileoperation.getValueFromPropertyFile(constants.CONFIG_WEB_FILE_PATH, "baseurl"), fileoperation.getValueFromPropertyFile(constants.CONFIG_WEB_FILE_PATH, "userId"));
		// validate the response 
		System.out.println(response.getStatusCode()+"my response code");
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
