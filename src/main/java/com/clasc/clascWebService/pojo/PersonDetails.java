package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonDetails {
	
	@Id
	@GeneratedValue
	private long person_id;
	private String popularity;
	private String known_for_dept;
	
	
	public long getPerson_id() {
		return person_id;
	}
	public void setPerson_id(long person_id) {
		this.person_id = person_id;
	}
	public String getPopularity() {
		return popularity;
	}
	public void setPopularity(String popularity) {
		this.popularity = popularity;
	}
	public String getKnown_for_dept() {
		return known_for_dept;
	}
	public void setKnown_for_dept(String known_for_dept) {
		this.known_for_dept = known_for_dept;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfile_path() {
		return profile_path;
	}
	public void setProfile_path(String profile_path) {
		this.profile_path = profile_path;
	}
	private String gender;
	private String profile_path;
	
	

}
