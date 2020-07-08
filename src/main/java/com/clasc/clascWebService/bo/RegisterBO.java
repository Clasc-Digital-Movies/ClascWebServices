package com.clasc.clascWebService.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clasc.clascWebService.Service.UserInfoRegistrationService;
import com.clasc.clascWebService.pojo.UserDeviceInfo;
import com.clasc.clascWebService.pojo.UserInfo;
import com.clasc.clascWebService.request.RegisterRequest;

@Component
public class RegisterBO {
	
	@Autowired
	UserInfoRegistrationService registerUserService;
	
	@Autowired
	CommonValidationBO commonValidationBO;
	
	public UserInfo convertRequest(RegisterRequest registerRequest) {
		
		UserInfo userInfo = new UserInfo();
		try {
			
			userInfo.setEmailId(registerRequest.getEmailTextVal());
			userInfo.setFirst_name(registerRequest.getFirstNameVal());
			userInfo.setLast_name(registerRequest.getLastNameVal());
			userInfo.setPhoneNumber(registerRequest.getPhoneNumberTextVal() != null ? (Long.parseLong(registerRequest.getPhoneNumberTextVal())):0l);
			List<UserDeviceInfo> listDeviceInfo = new ArrayList<UserDeviceInfo>();
			UserDeviceInfo userDeviceInfo = new UserDeviceInfo();
			userDeviceInfo.setDevice_mac_id(registerRequest.getDeviceID());
			userDeviceInfo.setDevice_name(registerRequest.getDeviceName());
			userDeviceInfo.setMobileDeviceType(registerRequest.getDeviceType());
			listDeviceInfo.add(userDeviceInfo);
			userInfo.setUserDeviceInfo(listDeviceInfo);
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return userInfo;
		
	}

	public String validateRequest(UserInfo userInfo) {
		
		
		String retunValue = null;
		
		if(userInfo.getEmailId() == null || !commonValidationBO.validateEmailId(userInfo.getEmailId())) {
			return "Invalid Email Id";
		}
		if(!commonValidationBO.validatePhoneNumber(userInfo.getPhoneNumber().toString())) {
			return "Invalid Phone Number";
		}
		/*if(!commonValidationBO.validateName(userInfo.getFirst_name())) {
			return "Invalid First Name";
		}
		if(!commonValidationBO.validateName(userInfo.getLast_name())) {
			return "Invalid Last Name";
		}*/
		
		UserInfo userInfodtl = 	registerUserService.fetchUserByEmailId(userInfo.getEmailId());
		if(userInfodtl != null) {
			return "User "+userInfodtl.getEmailId()+" already exist";
		}
		
		return retunValue;
	}

}
