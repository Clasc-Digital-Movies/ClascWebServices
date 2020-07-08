package com.clasc.clascWebService.pojo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LoginInfo {
	
@Id
@GeneratedValue
	private long loginInfoId;
	private long otp;
	private long phoneSW;
	private long emailSW;
	private String sessionID;
	private Date expireDate;
	@ManyToOne
	private UserInfo userInfo;
	
	
	
	
	
	public long getOtp() {
		return otp;
	}
	public void setOtp(long otp) {
		this.otp = otp;
	}
	public long getPhoneSW() {
		return phoneSW;
	}
	public void setPhoneSW(long phoneSW) {
		this.phoneSW = phoneSW;
	}
	public long getEmailSW() {
		return emailSW;
	}
	public void setEmailSW(long emailSW) {
		this.emailSW = emailSW;
	}
	public String getSessionID() {
		return sessionID;
	}
	public void setSessionID(String sessionID) {
		this.sessionID = sessionID;
	}
	public long getLoginInfoId() {
		return loginInfoId;
	}
	public void setLoginInfoId(long loginInfoId) {
		this.loginInfoId = loginInfoId;
	}
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	
	
	
	
}
