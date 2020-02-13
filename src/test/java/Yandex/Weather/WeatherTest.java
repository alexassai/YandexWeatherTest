package Yandex.Weather;

import controllers.WeatherRequestCtrl;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import models.Area;
import models.Info;
import models.WeatherRequest;
import org.junit.*;

import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class WeatherTest {

  private RequestSpecification requestSpecification;
  private Area response;

//  public void testMoscow() {
//    // Moscow - lat: 55.75396, lon: 37.620393
//    Area MoscowRequest = new Area(37.620393, 55.75396, 2);
//    Area MoscowResponse = new WeatherRequestCtrl(MoscowRequest).sendWeatherRequest();
//    }
//
//  }


  @Test
  public void MoscowTest() {
    response = RestAssured.given()
            .baseUri("https://api.weather.yandex.ru")
            .basePath("/v1/informers?")
            .contentType(ContentType.JSON)
            .header("X-Yandex-API-Key", "c6f1a85b-f593-40a8-8d5a-4b0f23c8c398")
            .param("lat", "55.75396")
            .param("lon", "37.620393")
          //  .param("limit", "2")
            .log().all()
            .when().get()
            .then()
            .statusCode(200)
            .extract().response().as(Area.class);
    System.out.println(response.toString());
  }


  @Test
  public void ABC (){

    WeatherRequest MoscowRequest = new WeatherRequest(37.620393, 55.75396);
    Area MoscowResponse = new WeatherRequestCtrl(MoscowRequest).sendWeatherRequest();
    System.out.println((MoscowResponse.toString()));

    assumeTrue("abc".contains("a"));

  }
    }

