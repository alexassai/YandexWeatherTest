package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Tzinfo{

	@JsonProperty("offset")
	private int offset;

	@JsonProperty("dst")
	private boolean dst;

	@JsonProperty("name")
	private String name;

	@JsonProperty("abbr")
	private String abbr;

	public void setOffset(int offset){
		this.offset = offset;
	}

	public int getOffset(){
		return offset;
	}

	public void setDst(boolean dst){
		this.dst = dst;
	}

	public boolean isDst(){
		return dst;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAbbr(String abbr){
		this.abbr = abbr;
	}

	public String getAbbr(){
		return abbr;
	}

	@Override
 	public String toString(){
		return 
			"Tzinfo{" + 
			"offset = '" + offset + '\'' + 
			",dst = '" + dst + '\'' + 
			",name = '" + name + '\'' + 
			",abbr = '" + abbr + '\'' + 
			"}";
		}
}