package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Fact{

	@JsonProperty("polar")
	private boolean polar;

	@JsonProperty("accum_prec")
	private AccumPrec accumPrec;

	@JsonProperty("temp")
	private int temp;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("pressure_mm")
	private int pressureMm;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("source")
	private String source;

	@JsonProperty("feels_like")
	private int feelsLike;

	@JsonProperty("wind_gust")
	private double windGust;

	@JsonProperty("condition")
	private String condition;

	@JsonProperty("uv_index")
	private int uvIndex;

	@JsonProperty("pressure_pa")
	private int pressurePa;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("season")
	private String season;

	@JsonProperty("wind_speed")
	private double windSpeed;

	@JsonProperty("soil_moisture")
	private double soilMoisture;

	@JsonProperty("daytime")
	private String daytime;

	@JsonProperty("soil_temp")
	private int soilTemp;

	@JsonProperty("obs_time")
	private int obsTime;

	public void setPolar(boolean polar){
		this.polar = polar;
	}

	public boolean isPolar(){
		return polar;
	}

	public void setAccumPrec(AccumPrec accumPrec){
		this.accumPrec = accumPrec;
	}

	public AccumPrec getAccumPrec(){
		return accumPrec;
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

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
	}

	public void setFeelsLike(int feelsLike){
		this.feelsLike = feelsLike;
	}

	public int getFeelsLike(){
		return feelsLike;
	}

	public void setWindGust(double windGust){
		this.windGust = windGust;
	}

	public double getWindGust(){
		return windGust;
	}

	public void setCondition(String condition){
		this.condition = condition;
	}

	public String getCondition(){
		return condition;
	}

	public void setUvIndex(int uvIndex){
		this.uvIndex = uvIndex;
	}

	public int getUvIndex(){
		return uvIndex;
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

	public void setSoilMoisture(double soilMoisture){
		this.soilMoisture = soilMoisture;
	}

	public double getSoilMoisture(){
		return soilMoisture;
	}

	public void setDaytime(String daytime){
		this.daytime = daytime;
	}

	public String getDaytime(){
		return daytime;
	}

	public void setSoilTemp(int soilTemp){
		this.soilTemp = soilTemp;
	}

	public int getSoilTemp(){
		return soilTemp;
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
			",accum_prec = '" + accumPrec + '\'' + 
			",temp = '" + temp + '\'' + 
			",icon = '" + icon + '\'' + 
			",pressure_mm = '" + pressureMm + '\'' + 
			",wind_dir = '" + windDir + '\'' + 
			",source = '" + source + '\'' + 
			",feels_like = '" + feelsLike + '\'' + 
			",wind_gust = '" + windGust + '\'' + 
			",condition = '" + condition + '\'' + 
			",uv_index = '" + uvIndex + '\'' + 
			",pressure_pa = '" + pressurePa + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",season = '" + season + '\'' + 
			",wind_speed = '" + windSpeed + '\'' + 
			",soil_moisture = '" + soilMoisture + '\'' + 
			",daytime = '" + daytime + '\'' + 
			",soil_temp = '" + soilTemp + '\'' + 
			",obs_time = '" + obsTime + '\'' + 
			"}";
		}
}