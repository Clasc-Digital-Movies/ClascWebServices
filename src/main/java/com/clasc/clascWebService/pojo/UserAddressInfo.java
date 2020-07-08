package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class UserAddressInfo {
	
	
	@Id
	@GeneratedValue
	private long address_info_id;
	private String address_line1;
	private String address_line2;
	private String state;
	private String city;
	private String country;
	private long zipCode;
	@OneToOne
	private UserInfo UserInfo;
	
	
	public long getAddress_info_id() {
		return address_info_id;
	}
	public void setAddress_info_id(long address_info_id) {
		this.address_info_id = address_info_id;
	}
	public String getAddress_line1() {
		return address_line1;
	}
	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}
	public String getAddress_line2() {
		return address_line2;
	}
	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getZipCode() {
		return zipCode;
	}
	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}
	public UserInfo getUserInfo() {
		return UserInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		UserInfo = userInfo;
	}
	
	
	

}
