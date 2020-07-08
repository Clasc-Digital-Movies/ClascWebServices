package com.clasc.clascWebService.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class UserDeviceInfo {
	
	@Id
	@GeneratedValue
	private long device_info_id;
	private String device_mac_id;
	private String device_name;
	private String mobileDeviceType;
	private char smartTVDeviceType;
	@ManyToOne
	private UserInfo userInfo;
	
	public long getDevice_info_id() {
		return device_info_id;
	}
	public void setDevice_info_id(long device_info_id) {
		this.device_info_id = device_info_id;
	}
	public String getDevice_mac_id() {
		return device_mac_id;
	}
	public void setDevice_mac_id(String device_mac_id) {
		this.device_mac_id = device_mac_id;
	}
	public String getDevice_name() {
		return device_name;
	}
	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}
	public String getMobileDeviceType() {
		return mobileDeviceType;
	}
	public void setMobileDeviceType(String mobileDeviceType) {
		this.mobileDeviceType = mobileDeviceType;
	}
	public char getSmartTVDeviceType() {
		return smartTVDeviceType;
	}
	public void setSmartTVDeviceType(char smartTVDeviceType) {
		this.smartTVDeviceType = smartTVDeviceType;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	

}
