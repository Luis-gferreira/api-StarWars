package br.com.rsi.api;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.junit.Test;


public class Planets {

	@Test
	public void listaPlanets() {
		given()
		.when()
			.get("https://swapi.co/api/planets")
		.then()
			.statusCode(200)
			.body(containsString("Alderaan"))
			.body(containsString("Yavin IV"))
			.body(containsString("Dagobah"))
			.body(is(not(nullValue())));
	}	
}
