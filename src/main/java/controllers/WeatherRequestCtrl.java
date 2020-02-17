
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
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;




public class WeatherRequestCtrl {
    private RequestSpecification requestSpecification;
    private WeatherRequest moscow;

  //  public WeatherRequestCtrl(WeatherRequest request){
  public WeatherRequestCtrl(){
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addHeader("X-Yandex-API-Key", "c6f1a85b-f593-40a8-8d5a-4b0f23c8c398")
.setBaseUri("https://api.weather.yandex.ru")
                .setBasePath("/v1/informers?")
                .addParam("lat", "55.75396")
                .addParam("lon", "37.620393")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();

        RestAssured.responseSpecification = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(15000L))
                .build();
        RestAssured.defaultParser = Parser.JSON;
    }

    public Area creteNewRequest() {
        return given(requestSpecification)
              //  .basePath("/v1/informers?")
               // .param("lat", "55.75396")
               // .param("lon", "37.620393")
                .get().as(Area.class);

    }



}
