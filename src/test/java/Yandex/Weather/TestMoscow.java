package Yandex.Weather;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import models.Info;
import org.junit.Test;
import com.fasterxml.jackson.databind.*;

public class TestMoscow {

  // Moscow - lat: 55.75396, lon: 37.620393
  Info Request = new Info(37.620393, 55.75396, 2);

  @Test

  public void MoscowTest(){
    RestAssured.given()
            .baseUri("https://api.weather.yandex.ru")
            .basePath("/v1/forecast?")
            .contentType(ContentType.JSON)
            .header("X-Yandex-API-Key", "c6f1a85b-f593-40a8-8d5a-4b0f23c8c398")
            .param("lat", Request.getLat())
            .param("lon", Request.getLon())
            .param("limit", Request.getLimit())
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
