package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Parts{

	@JsonProperty("night")
	private Night night;

	@JsonProperty("day_short")
	private DayShort dayShort;

	@JsonProperty("evening")
	private Evening evening;

	@JsonProperty("day")
	private Day day;

	@JsonProperty("night_short")
	private NightShort nightShort;

	@JsonProperty("morning")
	private Morning morning;

	public void setNight(Night night){
		this.night = night;
	}

	public Night getNight(){
		return night;
	}

	public void setDayShort(DayShort dayShort){
		this.dayShort = dayShort;
	}

	public DayShort getDayShort(){
		return dayShort;
	}

	public void setEvening(Evening evening){
		this.evening = evening;
	}

	public Evening getEvening(){
		return evening;
	}

	public void setDay(Day day){
		this.day = day;
	}

	public Day getDay(){
		return day;
	}

	public void setNightShort(NightShort nightShort){
		this.nightShort = nightShort;
	}

	public NightShort getNightShort(){
		return nightShort;
	}

	public void setMorning(Morning morning){
		this.morning = morning;
	}

	public Morning getMorning(){
		return morning;
	}

	@Override
 	public String toString(){
		return 
			"Parts{" + 
			"night = '" + night + '\'' + 
			",day_short = '" + dayShort + '\'' + 
			",evening = '" + evening + '\'' + 
			",day = '" + day + '\'' + 
			",night_short = '" + nightShort + '\'' + 
			",morning = '" + morning + '\'' + 
			"}";
		}
}