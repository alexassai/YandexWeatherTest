
package controllers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import models.Area;
import models.Info;
import models.WeatherRequest;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;


public class WeatherRequestCtrl {
    private RequestSpecification requestSpecification1;
    private ResponseSpecification responseSpecification1;
    private WeatherRequest request;

    public WeatherRequestCtrl() {
        RequestSpecification requestSpecification1 = new RequestSpecBuilder()
                .addHeader("X-Yandex-API-Key", "c6f1a85b-f593-40a8-8d5a-4b0f23c8c398")
                .setBaseUri("https://api.weather.yandex.ru")
                .setBasePath("/v1/informers?")
                .addParam("lat", "55.75396")
                .addParam("lon", "37.620393")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();

        ResponseSpecification responseSpecification1 = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(15000L))
                .build();
        RestAssured.defaultParser = Parser.JSON;
    }


    public WeatherRequestCtrl(Area area) {
        RequestSpecification requestSpecification1 = new RequestSpecBuilder()
                .addHeader("X-Yandex-API-Key", "c6f1a85b-f593-40a8-8d5a-4b0f23c8c398")
                .setBaseUri("https://api.weather.yandex.ru")
                .setBasePath("/v1/informers?")
                .addParam("lat", area.getInfo().getLat())
                .addParam("lon", area.getInfo().getLon())
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();

        ResponseSpecification responseSpecification1 = new ResponseSpecBuilder()
                .expectContentType(ContentType.JSON)
                .expectResponseTime(Matchers.lessThan(15000L))
                .build();
        RestAssured.defaultParser = Parser.JSON;
       area = given(requestSpecification1, responseSpecification1).get().as(Area.class);
       System.out.println(area.toString() + "jopa");
      //  System.out.println(given(requestSpecification1, responseSpecification1).get().as(Area.class).toString());
    }
}
