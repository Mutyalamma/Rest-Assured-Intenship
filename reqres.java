package ResponseValidtaion;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class reqres {
	
	@Test
	public void getusers()
	{
		 RestAssured.baseURI  = "https://reqres.in/api";
		 given().get("users?page=2").then().assertThat().body(matchesJsonSchemaInClasspath("getschema.json")).statusCode(200);
	}
	

}
