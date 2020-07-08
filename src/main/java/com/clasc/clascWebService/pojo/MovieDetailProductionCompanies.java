package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovieDetailProductionCompanies {
	
	@Id
	@GeneratedValue
	private long prod_comp_id;
	private String logo_path;
	private String prd_comp_name;
	private String orig_country;
	
	
	public long getProd_comp_id() {
		return prod_comp_id;
	}
	public void setProd_comp_id(long prod_comp_id) {
		this.prod_comp_id = prod_comp_id;
	}
	public String getLogo_path() {
		return logo_path;
	}
	public void setLogo_path(String logo_path) {
		this.logo_path = logo_path;
	}
	public String getPrd_comp_name() {
		return prd_comp_name;
	}
	public void setPrd_comp_name(String prd_comp_name) {
		this.prd_comp_name = prd_comp_name;
	}
	public String getOrig_country() {
		return orig_country;
	}
	public void setOrig_country(String orig_country) {
		this.orig_country = orig_country;
	}
	
	

}
