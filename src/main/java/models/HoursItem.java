package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class HoursItem{

	@JsonProperty("hour_ts")
	private int hourTs;

	@JsonProperty("temp")
	private int temp;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("pressure_mm")
	private int pressureMm;

	@JsonProperty("prec_period")
	private int precPeriod;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("feels_like")
	private int feelsLike;

	@JsonProperty("wind_gust")
	private int windGust;

	@JsonProperty("condition")
	private String condition;

	@JsonProperty("hour")
	private String hour;

	@JsonProperty("uv_index")
	private int uvIndex;

	@JsonProperty("pressure_pa")
	private int pressurePa;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("wind_speed")
	private double windSpeed;

	@JsonProperty("soil_moisture")
	private double soilMoisture;

	@JsonProperty("soil_temp")
	private int soilTemp;

	@JsonProperty("prec_mm")
	private int precMm;

	@JsonProperty("prec_prob")
	private int precProb;

	@JsonProperty("_nowcast")
	private boolean nowcast;

	public void setHourTs(int hourTs){
		this.hourTs = hourTs;
	}

	public int getHourTs(){
		return hourTs;
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

	public void setPrecPeriod(int precPeriod){
		this.precPeriod = precPeriod;
	}

	public int getPrecPeriod(){
		return precPeriod;
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

	public void setHour(String hour){
		this.hour = hour;
	}

	public String getHour(){
		return hour;
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

	public void setPrecMm(int precMm){
		this.precMm = precMm;
	}

	public int getPrecMm(){
		return precMm;
	}

	public void setPrecProb(int precProb){
		this.precProb = precProb;
	}

	public int getPrecProb(){
		return precProb;
	}

	public void setNowcast(boolean nowcast){
		this.nowcast = nowcast;
	}

	public boolean isNowcast(){
		return nowcast;
	}

	@Override
 	public String toString(){
		return 
			"HoursItem{" + 
			"hour_ts = '" + hourTs + '\'' + 
			",temp = '" + temp + '\'' + 
			",icon = '" + icon + '\'' + 
			",pressure_mm = '" + pressureMm + '\'' + 
			",prec_period = '" + precPeriod + '\'' + 
			",wind_dir = '" + windDir + '\'' + 
			",feels_like = '" + feelsLike + '\'' + 
			",wind_gust = '" + windGust + '\'' + 
			",condition = '" + condition + '\'' + 
			",hour = '" + hour + '\'' + 
			",uv_index = '" + uvIndex + '\'' + 
			",pressure_pa = '" + pressurePa + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",wind_speed = '" + windSpeed + '\'' + 
			",soil_moisture = '" + soilMoisture + '\'' + 
			",soil_temp = '" + soilTemp + '\'' + 
			",prec_mm = '" + precMm + '\'' + 
			",prec_prob = '" + precProb + '\'' + 
			",_nowcast = '" + nowcast + '\'' + 
			"}";
		}
}