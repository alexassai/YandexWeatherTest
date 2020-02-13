package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Fact{

	@JsonProperty("polar")
	private boolean polar;

	@JsonProperty("temp")
	private int temp;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("pressure_mm")
	private int pressureMm;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("feels_like")
	private int feelsLike;

	@JsonProperty("wind_gust")
	private int windGust;

	@JsonProperty("condition")
	private String condition;

	@JsonProperty("pressure_pa")
	private int pressurePa;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("season")
	private String season;

	@JsonProperty("wind_speed")
	private double windSpeed;

	@JsonProperty("daytime")
	private String daytime;

	@JsonProperty("obs_time")
	private int obsTime;

	public void setPolar(boolean polar){
		this.polar = polar;
	}

	public boolean isPolar(){
		return polar;
	}

	public void setTemp(int temp){
		this.temp = temp;
	}

	public int getTemp(){
		return temp;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

	public String getIcon(){
		return icon;
	}

	public void setPressureMm(int pressureMm){
		this.pressureMm = pressureMm;
	}

	public int getPressureMm(){
		return pressureMm;
	}

	public void setWindDir(String windDir){
		this.windDir = windDir;
	}

	public String getWindDir(){
		return windDir;
	}

	public void setFeelsLike(int feelsLike){
		this.feelsLike = feelsLike;
	}

	public int getFeelsLike(){
		return feelsLike;
	}

	public void setWindGust(int windGust){
		this.windGust = windGust;
	}

	public int getWindGust(){
		return windGust;
	}

	public void setCondition(String condition){
		this.condition = condition;
	}

	public String getCondition(){
		return condition;
	}

	public void setPressurePa(int pressurePa){
		this.pressurePa = pressurePa;
	}

	public int getPressurePa(){
		return pressurePa;
	}

	public void setHumidity(int humidity){
		this.humidity = humidity;
	}

	public int getHumidity(){
		return humidity;
	}

	public void setSeason(String season){
		this.season = season;
	}

	public String getSeason(){
		return season;
	}

	public void setWindSpeed(double windSpeed){
		this.windSpeed = windSpeed;
	}

	public double getWindSpeed(){
		return windSpeed;
	}

	public void setDaytime(String daytime){
		this.daytime = daytime;
	}

	public String getDaytime(){
		return daytime;
	}

	public void setObsTime(int obsTime){
		this.obsTime = obsTime;
	}

	public int getObsTime(){
		return obsTime;
	}

	@Override
 	public String toString(){
		return 
			"Fact{" + 
			"polar = '" + polar + '\'' + 
			",temp = '" + temp + '\'' + 
			",icon = '" + icon + '\'' + 
			",pressure_mm = '" + pressureMm + '\'' + 
			",wind_dir = '" + windDir + '\'' + 
			",feels_like = '" + feelsLike + '\'' + 
			",wind_gust = '" + windGust + '\'' + 
			",condition = '" + condition + '\'' + 
			",pressure_pa = '" + pressurePa + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",season = '" + season + '\'' + 
			",wind_speed = '" + windSpeed + '\'' + 
			",daytime = '" + daytime + '\'' + 
			",obs_time = '" + obsTime + '\'' + 
			"}";
		}
}