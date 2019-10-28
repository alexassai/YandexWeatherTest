package Yandex.Weather;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Test;
import com.fasterxml.jackson.databind.*;

public class TestMoscow {

  @Test

  public void MoscowTest(){
    RestAssured.given()
            .baseUri("https://api.weather.yandex.ru")
            .basePath("/v1/forecast?")
            .contentType(ContentType.JSON)
            .header("X-Yandex-API-Key", "c6f1a85b-f593-40a8-8d5a-4b0f23c8c398")
            .param("lat", "55.75396")
            .param("lon", "37.620393")
            .param("limit", "2")
            .log().all()
            .when().get()
            .then()
            .statusCode(200)
           // .body("now", Matchers.equalTo("123")
  .extract().response().prettyPrint();




  }

//  ObjectMapper mapper = new ObjectMapper();
//  Area user = mapper.readValue("{\"name\": \"John\"}", Person.class);
//
//System.out.println(user.name); //John
}
