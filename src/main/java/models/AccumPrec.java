package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class AccumPrec{

	@JsonProperty("1")
	private double jsonMember1;

	@JsonProperty("3")
	private double jsonMember3;

	@JsonProperty("7")
	private double jsonMember7;

	public void setJsonMember1(double jsonMember1){
		this.jsonMember1 = jsonMember1;
	}

	public double getJsonMember1(){
		return jsonMember1;
	}

	public void setJsonMember3(double jsonMember3){
		this.jsonMember3 = jsonMember3;
	}

	public double getJsonMember3(){
		return jsonMember3;
	}

	public void setJsonMember7(double jsonMember7){
		this.jsonMember7 = jsonMember7;
	}

	public double getJsonMember7(){
		return jsonMember7;
	}

	@Override
 	public String toString(){
		return 
			"AccumPrec{" + 
			"1 = '" + jsonMember1 + '\'' + 
			",3 = '" + jsonMember3 + '\'' + 
			",7 = '" + jsonMember7 + '\'' + 
			"}";
		}
}