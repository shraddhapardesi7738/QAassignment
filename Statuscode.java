package RestassuredStatuscode.RestassuredStatuscode;

import static io.restassured.RestAssured.get;


import org.testng.annotations.Test;

public class Statuscode {
	String URL="https://apiproxy.paytm.com/v2/movies/upcoming";
  @Test
  public void f() {
	  get(URL).then().assertThat().statusCode(200).log().all();
  }
}
