package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FemaleSupportingLeadClone {

	@Id
	@GeneratedValue
	private long female_supp_lead_id;
	private String female_supp_lead_name;
	private String female_supp_lead_path;
	
	
	public long getFemale_supp_lead_id() {
		return female_supp_lead_id;
	}
	public void setFemale_supp_lead_id(long female_supp_lead_id) {
		this.female_supp_lead_id = female_supp_lead_id;
	}
	public String getFemale_supp_lead_name() {
		return female_supp_lead_name;
	}
	public void setFemale_supp_lead_name(String female_supp_lead_name) {
		this.female_supp_lead_name = female_supp_lead_name;
	}
	public String getFemale_supp_lead_path() {
		return female_supp_lead_path;
	}
	public void setFemale_supp_lead_path(String female_supp_lead_path) {
		this.female_supp_lead_path = female_supp_lead_path;
	}
	
	
}
