package models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Response{

	@JsonProperty("now_dt")
	private String nowDt;

	@JsonProperty("fact")
	private Fact fact;

	@JsonProperty("now")
	private int now;

	@JsonProperty("info")
	private Info info;

	@JsonProperty("forecasts")
	private List<ForecastsItem> forecasts;

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

	public void setInfo(Info info){
		this.info = info;
	}

	public Info getInfo(){
		return info;
	}

	public void setForecasts(List<ForecastsItem> forecasts){
		this.forecasts = forecasts;
	}

	public List<ForecastsItem> getForecasts(){
		return forecasts;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"now_dt = '" + nowDt + '\'' + 
			",fact = '" + fact + '\'' + 
			",now = '" + now + '\'' + 
			",info = '" + info + '\'' + 
			",forecasts = '" + forecasts + '\'' + 
			"}";
		}
}