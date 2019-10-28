package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class Info{

	@JsonProperty("nr")
	private boolean nr;

	@JsonProperty("ns")
	private boolean ns;

	@JsonProperty("f")
	private boolean F;

	@JsonProperty("def_pressure_mm")
	private int defPressureMm;

	@JsonProperty("_h")
	private boolean H;

	@JsonProperty("lon")
	private double lon;

	@JsonProperty("nsr")
	private boolean nsr;

	@JsonProperty("n")
	private boolean N;

	@JsonProperty("tzinfo")
	private Tzinfo tzinfo;

	@JsonProperty("url")
	private String url;

	@JsonProperty("p")
	private boolean P;

	@JsonProperty("def_pressure_pa")
	private int defPressurePa;

	@JsonProperty("lat")
	private double lat;

	@JsonProperty("limit")
	private int limit;

	public Info(boolean nr, boolean ns, boolean f, int defPressureMm, boolean h, double lon, boolean nsr, boolean n, Tzinfo tzinfo, String url, boolean p, int defPressurePa, double lat) {
		this.nr = nr;
		this.ns = ns;
		F = f;
		this.defPressureMm = defPressureMm;
		H = h;
		this.lon = lon;
		this.nsr = nsr;
		N = n;
		this.tzinfo = tzinfo;
		this.url = url;
		P = p;
		this.defPressurePa = defPressurePa;
		this.lat = lat;
	}


	public Info (double lon,  double lat, int limit) {
		this.lon = lon;
		this.lat = lat;
		this.limit = limit;
	}

	public void setNr(boolean nr){
		this.nr = nr;
	}

	public boolean isNr(){
		return nr;
	}

	public void setNs(boolean ns){
		this.ns = ns;
	}

	public boolean isNs(){
		return ns;
	}

	public void setF(boolean F){
		this.F = F;
	}

	public boolean isF(){
		return F;
	}

	public void setDefPressureMm(int defPressureMm){
		this.defPressureMm = defPressureMm;
	}

	public int getDefPressureMm(){
		return defPressureMm;
	}

	public void setH(boolean H){
		this.H = H;
	}

	public boolean isH(){
		return H;
	}

	public void setLon(double lon){
		this.lon = lon;
	}

	public double getLon(){
		return lon;
	}

	public void setNsr(boolean nsr){
		this.nsr = nsr;
	}

	public boolean isNsr(){
		return nsr;
	}

	public void setN(boolean N){
		this.N = N;
	}

	public boolean isN(){
		return N;
	}

	public void setTzinfo(Tzinfo tzinfo){
		this.tzinfo = tzinfo;
	}

	public Tzinfo getTzinfo(){
		return tzinfo;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setP(boolean P){
		this.P = P;
	}

	public boolean isP(){
		return P;
	}

	public void setDefPressurePa(int defPressurePa){
		this.defPressurePa = defPressurePa;
	}

	public int getDefPressurePa(){
		return defPressurePa;
	}

	public void setLat(double lat){
		this.lat = lat;
	}

	public double getLat(){
		return lat;
	}

	@Override
 	public String toString(){
		return 
			"Info{" + 
			"nr = '" + nr + '\'' + 
			",ns = '" + ns + '\'' + 
			",f = '" + F + '\'' + 
			",def_pressure_mm = '" + defPressureMm + '\'' + 
			",_h = '" + H + '\'' + 
			",lon = '" + lon + '\'' + 
			",nsr = '" + nsr + '\'' + 
			",n = '" + N + '\'' + 
			",tzinfo = '" + tzinfo + '\'' + 
			",url = '" + url + '\'' + 
			",p = '" + P + '\'' + 
			",def_pressure_pa = '" + defPressurePa + '\'' + 
			",lat = '" + lat + '\'' + 
			"}";
		}
}