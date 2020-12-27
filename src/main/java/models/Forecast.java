package models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Forecast {

    @JsonProperty("date")
    private String date;

    @JsonProperty("sunrise")
    private String sunrise;

    @JsonProperty("week")
    private int week;

    @JsonProperty("moon_text")
    private String moonText;

    @JsonProperty("date_ts")
    private int dateTs;

    @JsonProperty("sunset")
    private String sunset;

    @JsonProperty("parts")
    private List<PartsItem> parts;

    @JsonProperty("moon_code")
    private int moonCode;

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunrise() {
        return sunrise;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getWeek() {
        return week;
    }

    public void setMoonText(String moonText) {
        this.moonText = moonText;
    }

    public String getMoonText() {
        return moonText;
    }

    public void setDateTs(int dateTs) {
        this.dateTs = dateTs;
    }

    public int getDateTs() {
        return dateTs;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public String getSunset() {
        return sunset;
    }

    public void setParts(List<PartsItem> parts) {
        this.parts = parts;
    }

    public List<PartsItem> getParts() {
        return parts;
    }

    public void setMoonCode(int moonCode) {
        this.moonCode = moonCode;
    }

    public int getMoonCode() {
        return moonCode;
    }

    @Override
    public String toString() {
        return
                "Forecast{" +
                        "date = '" + date + '\'' +
                        ",sunrise = '" + sunrise + '\'' +
                        ",week = '" + week + '\'' +
                        ",moon_text = '" + moonText + '\'' +
                        ",date_ts = '" + dateTs + '\'' +
                        ",sunset = '" + sunset + '\'' +
                        ",parts = '" + parts + '\'' +
                        ",moon_code = '" + moonCode + '\'' +
                        "}";
    }
}