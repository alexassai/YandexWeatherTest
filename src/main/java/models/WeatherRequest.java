package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class WeatherRequest{

  @JsonProperty("lon")
  private double lon;

  @JsonProperty("lat")
  private double lat;

  public WeatherRequest(double lon, double lat) {
    this.lon = lon;
    this.lat = lat;
  }

  public void setLon(double lon){
    this.lon = lon;
  }

  public double getLon(){
    return lon;
  }

  public void setLat(double lat){
    this.lat = lat;
  }

  public double getLat(){
    return lat;
  }

  @Override
  public String toString(){
    return
            "Info{" +
                    "lon = '" + lon + '\'' +
                    ",lat = '" + lat + '\'' +
                    "}";
  }
}