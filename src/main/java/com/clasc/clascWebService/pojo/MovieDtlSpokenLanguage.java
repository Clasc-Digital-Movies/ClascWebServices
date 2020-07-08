package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MovieDtlSpokenLanguage {
	@Id
	@GeneratedValue
		
	private long language_id;
	private String iso_cd; //iso_639_1
	private String name;
	
	public String getIso_cd() {
		return iso_cd;
	}
	public void setIso_cd(String iso_cd) {
		this.iso_cd = iso_cd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(long language_id) {
		this.language_id = language_id;
	}
	
	

}
