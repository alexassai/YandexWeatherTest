package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class DayShort{

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
	private double windGust;

	@JsonProperty("temp_min")
	private int tempMin;

	@JsonProperty("condition")
	private String condition;

	@JsonProperty("uv_index")
	private int uvIndex;

	@JsonProperty("pressure_pa")
	private int pressurePa;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("_source")
	private String source;

	@JsonProperty("wind_speed")
	private double windSpeed;

	@JsonProperty("soil_moisture")
	private double soilMoisture;

	@JsonProperty("soil_temp")
	private int soilTemp;

	@JsonProperty("prec_mm")
	private double precMm;

	@JsonProperty("prec_prob")
	private int precProb;

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

	public void setWindGust(double windGust){
		this.windGust = windGust;
	}

	public double getWindGust(){
		return windGust;
	}

	public void setTempMin(int tempMin){
		this.tempMin = tempMin;
	}

	public int getTempMin(){
		return tempMin;
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

	public void setSource(String source){
		this.source = source;
	}

	public String getSource(){
		return source;
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

	public void setSoilTemp(int soilTemp){
		this.soilTemp = soilTemp;
	}

	public int getSoilTemp(){
		return soilTemp;
	}

	public void setPrecMm(double precMm){
		this.precMm = precMm;
	}

	public double getPrecMm(){
		return precMm;
	}

	public void setPrecProb(int precProb){
		this.precProb = precProb;
	}

	public int getPrecProb(){
		return precProb;
	}

	@Override
 	public String toString(){
		return 
			"DayShort{" + 
			"temp = '" + temp + '\'' + 
			",icon = '" + icon + '\'' + 
			",pressure_mm = '" + pressureMm + '\'' + 
			",wind_dir = '" + windDir + '\'' + 
			",feels_like = '" + feelsLike + '\'' + 
			",wind_gust = '" + windGust + '\'' + 
			",temp_min = '" + tempMin + '\'' + 
			",condition = '" + condition + '\'' + 
			",uv_index = '" + uvIndex + '\'' + 
			",pressure_pa = '" + pressurePa + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",_source = '" + source + '\'' + 
			",wind_speed = '" + windSpeed + '\'' + 
			",soil_moisture = '" + soilMoisture + '\'' + 
			",soil_temp = '" + soilTemp + '\'' + 
			",prec_mm = '" + precMm + '\'' + 
			",prec_prob = '" + precProb + '\'' + 
			"}";
		}
}