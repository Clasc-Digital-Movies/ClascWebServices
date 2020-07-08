package com.clasc.clascWebService;

import java.util.Date;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.clasc.clascWebService.Repository.LogininfoDAO;
import com.clasc.clascWebService.Service.EmailService;
import com.clasc.clascWebService.Service.LoginInfoDAOImpl;
import com.clasc.clascWebService.Service.UserInfoRegistrationService;
import com.clasc.clascWebService.bo.EmailServiceBO;
import com.clasc.clascWebService.bo.RegisterBO;
import com.clasc.clascWebService.pojo.EmailMessage;
import com.clasc.clascWebService.pojo.LoginInfo;
import com.clasc.clascWebService.pojo.UserInfo;
import com.clasc.clascWebService.request.RegisterRequest;
import com.clasc.clascWebService.request.SignInRequest;
import com.clasc.clascWebService.response.DefaultResponse;
import com.clasc.clascWebService.response.SignInResponse;


@RestController
public class UserInfoRegistrationController {
	
	@Autowired
	UserInfoRegistrationService registerUserService;
	
	@Autowired
	LoginInfoDAOImpl loginInfoService;
	
	@Autowired
	EmailServiceBO emailServiceBO;
	
	@Autowired
	RegisterBO registerBO;
	
	
	
	private static final Logger log = LoggerFactory.getLogger(UserInfoRegistrationController.class);

	
	
	
	Random rand = new Random(); 
	
	
	
	@PostMapping("/registerUser")
	public DefaultResponse registerUser(@RequestBody RegisterRequest registerRequest) throws Exception {
		DefaultResponse returnResponse = new DefaultResponse();
		try {
			UserInfo userInfo = registerBO.convertRequest(registerRequest);
			userInfo.setFirst_name("vinay");
			userInfo.setLast_name("Goli");
			String validationMessage  = registerBO.validateRequest(userInfo);
				if(validationMessage != null) {
					returnResponse.setResponseCode(3);
					returnResponse.setMessage(validationMessage);
				}else {
					registerUserService.saveUser(userInfo);
					returnResponse.setResponseCode(1);
					returnResponse.setMessage("Sucessfully register. Please sign in");
					
				}
				
			
			
			
			
			
			
			
		}catch (Exception e) {
			log.error("Exception in registerUser "+e);
			returnResponse.setResponseCode(2);
			returnResponse.setMessage("System failure");
		
		}
		
		return returnResponse;
		
			
		
	}
	
	
	@PostMapping("/login")
		public SignInResponse loginUser(@RequestBody SignInRequest signInRequest) throws Exception {
			String tempEmailId = signInRequest.getEmailOrPhone();
			SignInResponse signInResponse = new SignInResponse();
			//String tempPwd = userInfo.getPwd;  ------------need to add PWD column 
			UserInfo userInfodtl = null;
			if(null!=tempEmailId && !"".equals(tempEmailId)) {
				 userInfodtl = 	registerUserService.fetchUserByEmailId(tempEmailId);
				
			}
			if(userInfodtl ==null) {
				signInResponse.setResponseCode(2);
				signInResponse.setResponseMessage("Invalid OTP");
			
			}else {
				signInResponse.setResponseCode(1);
				signInResponse.setResponseMessage("Sign in Sucessfull");
				signInResponse.setEmailId(userInfodtl.getEmailId());
				signInResponse.setPhoneNumber(userInfodtl.getPhoneNumber());
				signInResponse.setDeviceId(signInRequest.getDeviceId());
				signInResponse.setSessionId(signInRequest.getDeviceName());
				signInResponse.setFirstName(userInfodtl.getFirst_name());
				signInResponse.setLastName(userInfodtl.getLast_name());
			}
			
			return signInResponse;
			
			
		}
	
	@PostMapping("/sendOTP")
	public DefaultResponse sendOTP(@RequestBody String emailPhone) throws Exception {
		DefaultResponse returnResponse = new DefaultResponse();
		try {
			String tempEmailId = emailPhone;
			//String tempPwd = userInfo.getPwd;  ------------need to add PWD column 
			UserInfo userInfodtl = null;
			if(null!=tempEmailId && !"".equals(tempEmailId)) {
				 userInfodtl = 	registerUserService.fetchUserByEmailId(tempEmailId);
				
			}
			if(userInfodtl ==null) {
				returnResponse.setResponseCode(3);
				returnResponse.setMessage("User with " +tempEmailId+ " doesn't exists!");
			}else {
				int OTP = rand.nextInt(1000); 
				LoginInfo loginInfo = new LoginInfo();
				loginInfo.setEmailSW(1);
				loginInfo.setOtp(OTP);
				loginInfo.setPhoneSW(0);
				loginInfo.setUserInfo(userInfodtl);
				loginInfo = loginInfoService.saveLoginInfo(loginInfo);
				returnResponse = emailServiceBO.sendOTP(userInfodtl.getEmailId(), OTP+"");
			}
		}catch (Exception e) {
			returnResponse.setResponseCode(2);
			returnResponse.setMessage("System failure");
		}
		
		return returnResponse;
		
		
	}
	
	@PostMapping("/userInfo")
	public UserInfo userInfo(@RequestBody String email) throws Exception {
		String tempEmailId = email;
		//String tempPwd = userInfo.getPwd;  ------------need to add PWD column 
		UserInfo userInfodtl = null;
		if(null!=tempEmailId && !"".equals(tempEmailId)) {
			 userInfodtl = 	registerUserService.fetchUserByEmailId(tempEmailId);
			
		}
		if(userInfodtl ==null) {
			throw new Exception("User with " +tempEmailId+ "doesn't exists!");
		}else {
			int OTP = rand.nextInt(1000); 
			LoginInfo loginInfo = new LoginInfo();
			loginInfo.setEmailSW(1);
			loginInfo.setOtp(OTP);
			loginInfo.setPhoneSW(0);
			loginInfo.setUserInfo(userInfodtl);
			loginInfo = loginInfoService.saveLoginInfo(loginInfo);
			emailServiceBO.sendOTP(userInfodtl.getEmailId(), OTP+"");
		}
		return userInfodtl;
		
		
	}
	
	private void insertDummyDate() {
		UserInfo userInfo = new UserInfo();
		userInfo.setFirst_name("Monica");
		userInfo.setLast_name("Pandey");
		userInfo.setPhoneNumber(4702696657L);
		userInfo.setDob(new Date());
		userInfo.setEmailId("pandey.monica@gmail.com");
		registerUserService.saveUser(userInfo);
		
	}



}

