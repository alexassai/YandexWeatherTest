
package controllers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import models.Area;
import models.Info;
import models.WeatherRequest;
import org.hamcrest.Matchers;
import org.jetbrains.annotations.NotNull;

import static io.restassured.RestAssured.given;


public class WeatherRequestCtrl {

  private RequestSpecification requestSpecification;
  private WeatherRequest requestArea;


  public WeatherRequestCtrl(@NotNull WeatherRequest requestArea){
    RestAssured.requestSpecification = new RequestSpecBuilder()
            .addHeader("X-Yandex-API-Key", "c6f1a85b-f593-40a8-8d5a-4b0f23c8c398")
             .setBaseUri("https://api.weather.yandex.ru")
              .setBasePath("/v1/informers?")
              .addParam("lat", requestArea.getLat())
              .addParam("lon", requestArea.getLon())
             .setContentType(ContentType.JSON)
              .log(LogDetail.ALL).build();

    RestAssured.responseSpecification = new ResponseSpecBuilder()
            .expectContentType(ContentType.JSON)
            .expectResponseTime(Matchers.lessThan(15000L))
            .build();
    RestAssured.defaultParser = Parser.JSON;
this.requestArea = requestArea;
  }


  public Area sendWeatherRequest() {
  return given(requestSpecification)
          .get().as(Area.class);

}

  public static void main(String[] args) {

  }




}



