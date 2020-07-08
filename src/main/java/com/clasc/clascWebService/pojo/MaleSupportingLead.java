package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MaleSupportingLead {
	
	
	
	private long male_supp_lead_id;
	private String male_supp_lead_name;
	private String male_supp_image_path;
	
	@Id
	@GeneratedValue
	public long getMale_supp_lead_id() {
		return male_supp_lead_id;
	}
	public void setMale_supp_lead_id(long male_supp_lead_id) {
		this.male_supp_lead_id = male_supp_lead_id;
	}
	public String getMale_supp_lead_name() {
		return male_supp_lead_name;
	}
	public void setMale_supp_lead_name(String male_supp_lead_name) {
		this.male_supp_lead_name = male_supp_lead_name;
	}
	public String getMale_supp_image_path() {
		return male_supp_image_path;
	}
	public void setMale_supp_image_path(String male_supp_image_path) {
		this.male_supp_image_path = male_supp_image_path;
	}
	

}
