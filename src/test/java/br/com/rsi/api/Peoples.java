package br.com.rsi.api;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class Peoples {

	@Test
	public void listaPersonagens() {
		given()
		.when()
			.get("https://swapi.co/api/people")
		.then()
			.statusCode(200)
			.body(containsString("Obi-Wan Kenobi"))
			.body(containsString("Darth Vader"))
			.body(containsString("Luke Skywalker"))
			.body(is(not(nullValue())));
	}

}
