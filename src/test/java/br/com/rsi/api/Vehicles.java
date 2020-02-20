package br.com.rsi.api;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class Vehicles {

	@Test
	public void listaVehicles() {
		given()
		.when()
			.get("https://swapi.co/api/vehicles")
		.then()
			.statusCode(200)
			.body(containsString("T-16 skyhopper"))
			.body(containsString("X-34 landspeeder"))
			.body(containsString("Sand Crawler"))
			.body(is(not(nullValue())));
	}
}
