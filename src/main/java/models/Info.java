package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Info {

    @JsonProperty("lon")
    private double lon;

    @JsonProperty("lat")
    private double lat;

    @JsonProperty("url")
    private String url;

    public Info(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Info() {
        super();
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLon() {
        return lon;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLat() {
        return lat;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return
                "Info{" +
                        "lon = '" + lon + '\'' +
                        ",lat = '" + lat + '\'' +
                        ",url = '" + url + '\'' +
                        "}";
    }
}