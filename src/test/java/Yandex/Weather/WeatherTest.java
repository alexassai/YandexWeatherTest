package Yandex.Weather;

import controllers.WeatherRequestCtrl;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import models.Area;
import models.Info;
import models.WeatherRequest;
import org.junit.jupiter.api.Test;

public class WeatherTest {

  private RequestSpecification requestSpecification;
  private Area response;
  private WeatherRequest WeatherRequest;


  @Test
  public void MoscowTest() {
    response = RestAssured.given()
            .baseUri("https://api.weather.yandex.ru")
            .basePath("/v1/informers?")
            .contentType(ContentType.JSON)
            .header("X-Yandex-API-Key", "c6f1a85b-f593-40a8-8d5a-4b0f23c8c398")
            .param("lat", "55.75396")
            .param("lon", "37.620393")
            .log().all()
            .when().get()
            .then()
            .statusCode(200)
            .extract().response().as(Area.class);
    System.out.println(response.toString());
  }

@Test
  public void MoscowTest1(){
  Info Moscow = new Info(55.75396, 37.620393);
  new WeatherRequestCtrl(Moscow);
}
  }

