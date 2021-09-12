package Yandex.Weather;

import controllers.WeatherRequestCtrl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import models.Area;

public class WeatherTest {

    @Test
    public void MoscowTest1() {
        Area Moscow = new Area(37.620393, 55.75396);
        Area result = new WeatherRequestCtrl().sendWeatherRequest(Moscow);

        Assertions.assertEquals(Moscow.getInfo().getLat(), result.getInfo().getLat(), 0);
        Assertions.assertEquals(Moscow.getInfo().getLon(), result.getInfo().getLon(), 0);
    }
}