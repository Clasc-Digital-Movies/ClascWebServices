package com.clasc.clascWebService.pojo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity

public class UserInfo {
	
	@Id
	@GeneratedValue
	private long userInfoId;
	private String first_name;
	private String last_name;
	private Long phoneNumber;
	private Date dob;
	private int country_cd;
	private String emailId;
	private float latitude;
	private float longitude; 
	private char mobileRegSw;
	private char smartTVRegSw;
	@OneToMany(cascade = {CascadeType.ALL},mappedBy = "userInfo")
	private List<UserDeviceInfo>  userDeviceInfo;
	@OneToMany(cascade = {CascadeType.ALL},mappedBy = "userInfo")
	private List<LoginInfo>  loginInfo;
	
	
	public long getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(long userInfoId) {
		this.userInfoId = userInfoId;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long i) {
		this.phoneNumber = i;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getCountry_cd() {
		return country_cd;
	}

	public void setCountry_cd(int country_cd) {
		this.country_cd = country_cd;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public char getMobileRegSw() {
		return mobileRegSw;
	}

	public void setMobileRegSw(char mobileRegSw) {
		this.mobileRegSw = mobileRegSw;
	}

	public char getSmartTVRegSw() {
		return smartTVRegSw;
	}

	public void setSmartTVRegSw(char smartTVRegSw) {
		this.smartTVRegSw = smartTVRegSw;
	}

	public List<UserDeviceInfo> getUserDeviceInfo() {
		return userDeviceInfo;
	}

	public void setUserDeviceInfo(List<UserDeviceInfo> userDeviceInfo) {
		this.userDeviceInfo = userDeviceInfo;
	}

	public List<LoginInfo> getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(List<LoginInfo> loginInfo) {
		this.loginInfo = loginInfo;
	}




		
	
	

}
