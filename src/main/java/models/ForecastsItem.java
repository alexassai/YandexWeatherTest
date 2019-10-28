package models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class ForecastsItem{

	@JsonProperty("date")
	private String date;

	@JsonProperty("sunrise")
	private String sunrise;

	@JsonProperty("hours")
	private List<HoursItem> hours;

	@JsonProperty("week")
	private int week;

	@JsonProperty("moon_text")
	private String moonText;

	@JsonProperty("date_ts")
	private int dateTs;

	@JsonProperty("sunset")
	private String sunset;

	@JsonProperty("parts")
	private Parts parts;

	@JsonProperty("moon_code")
	private int moonCode;

	@JsonProperty("rise_begin")
	private String riseBegin;

	@JsonProperty("set_end")
	private String setEnd;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setSunrise(String sunrise){
		this.sunrise = sunrise;
	}

	public String getSunrise(){
		return sunrise;
	}

	public void setHours(List<HoursItem> hours){
		this.hours = hours;
	}

	public List<HoursItem> getHours(){
		return hours;
	}

	public void setWeek(int week){
		this.week = week;
	}

	public int getWeek(){
		return week;
	}

	public void setMoonText(String moonText){
		this.moonText = moonText;
	}

	public String getMoonText(){
		return moonText;
	}

	public void setDateTs(int dateTs){
		this.dateTs = dateTs;
	}

	public int getDateTs(){
		return dateTs;
	}

	public void setSunset(String sunset){
		this.sunset = sunset;
	}

	public String getSunset(){
		return sunset;
	}

	public void setParts(Parts parts){
		this.parts = parts;
	}

	public Parts getParts(){
		return parts;
	}

	public void setMoonCode(int moonCode){
		this.moonCode = moonCode;
	}

	public int getMoonCode(){
		return moonCode;
	}

	public void setRiseBegin(String riseBegin){
		this.riseBegin = riseBegin;
	}

	public String getRiseBegin(){
		return riseBegin;
	}

	public void setSetEnd(String setEnd){
		this.setEnd = setEnd;
	}

	public String getSetEnd(){
		return setEnd;
	}

	@Override
 	public String toString(){
		return 
			"ForecastsItem{" + 
			"date = '" + date + '\'' + 
			",sunrise = '" + sunrise + '\'' + 
			",hours = '" + hours + '\'' + 
			",week = '" + week + '\'' + 
			",moon_text = '" + moonText + '\'' + 
			",date_ts = '" + dateTs + '\'' + 
			",sunset = '" + sunset + '\'' + 
			",parts = '" + parts + '\'' + 
			",moon_code = '" + moonCode + '\'' + 
			",rise_begin = '" + riseBegin + '\'' + 
			",set_end = '" + setEnd + '\'' + 
			"}";
		}
}