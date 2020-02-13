package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Area{

	@JsonProperty("now_dt")
	private String nowDt;

	@JsonProperty("fact")
	private Fact fact;

	@JsonProperty("now")
	private int now;

	@JsonProperty("forecast")
	private Forecast forecast;

	@JsonProperty("info")
	private Info info;

	public void setNowDt(String nowDt){
		this.nowDt = nowDt;
	}

	public String getNowDt(){
		return nowDt;
	}

	public void setFact(Fact fact){
		this.fact = fact;
	}

	public Fact getFact(){
		return fact;
	}

	public void setNow(int now){
		this.now = now;
	}

	public int getNow(){
		return now;
	}

	public void setForecast(Forecast forecast){
		this.forecast = forecast;
	}

	public Forecast getForecast(){
		return forecast;
	}

	public void setInfo(Info info){
		this.info = info;
	}

	public Info getInfo(){
		return info;
	}

	@Override
 	public String toString(){
		return 
			"Area{" + 
			"now_dt = '" + nowDt + '\'' + 
			",fact = '" + fact + '\'' + 
			",now = '" + now + '\'' + 
			",forecast = '" + forecast + '\'' + 
			",info = '" + info + '\'' + 
			"}";
		}
}