package com.clasc.clascWebService.bo;

import org.springframework.stereotype.Component;

import com.clasc.clascWebService.Service.EmailService;
import com.clasc.clascWebService.pojo.EmailMessage;
import com.clasc.clascWebService.response.DefaultResponse;


@Component
public class EmailServiceBO {
	
	
	
	/*
	 * input emailId as string and OTP as String
	 * return int
	 * 0 - Success
	 * 1 - failure
	 * 2 - exception
	 */
	public DefaultResponse sendOTP(String emailId,String OTP) {
		DefaultResponse returnResponse = new DefaultResponse();
		returnResponse.setResponseCode(1);
		returnResponse.setMessage("Fail to send OTP");
		int returnCode = 1;
		try {
			EmailMessage emailMessage = new EmailMessage();
			emailMessage.setTo_address(emailId);
			emailMessage.setSubject("Clasc OTP number ");
			emailMessage.setBody("Clasc OTP number "+OTP);
			EmailService emailService = new EmailService();
			emailService.sendEmail(emailMessage);
			returnResponse.setResponseCode(0);
			returnResponse.setMessage("Successfully sent OTP");
		}catch (Exception e) {
			returnResponse.setResponseCode(2);
			returnResponse.setMessage("System failure");
		}
		
		return returnResponse;
	}

}
