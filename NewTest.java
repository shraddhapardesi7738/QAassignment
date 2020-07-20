package TestDate;
import static io.restassured.RestAssured.*;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import  static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.time.LocalDate;

public class NewTest {
	
	String url="https://apiproxy.paytm.com/v2/movies/upcoming";
	
  @Test
  public void function() {
	  
	  
			JsonArray jsonArray = new JsonArray();
			//Get the response as jsonArray.
			jsonArray = given().baseUri("https://localhost")
					.basePath("api/users")
					.get().as(JsonArray.class);

			//Loop through the array and get each element.
			for (int i = 0; i < jsonArray.size(); i++) {
				JsonObject jsonObject = jsonArray.get(i).getAsJsonObject();
				System.out.println(jsonObject.get("first_name").getAsString());

			}
}
  