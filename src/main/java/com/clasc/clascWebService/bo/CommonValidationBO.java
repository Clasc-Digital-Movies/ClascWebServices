package com.clasc.clascWebService.bo;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.springframework.stereotype.Component;

@Component
public class CommonValidationBO {
	
	public boolean validateEmailId(String emailId) {
		
		 boolean result = true;
		   try {
		      InternetAddress emailAddr = new InternetAddress(emailId);
		      emailAddr.validate();
		   } catch (AddressException ex) {
		      result = false;
		   }
		   return result;
		
	}
	
	public boolean validatePhoneNumber(String phoneNo) {
		//validate phone numbers of format "1234567890"
		if (phoneNo.matches("\\d{10}")) return true;
		//validating phone number with -, . or spaces
		else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
		//validating phone number with extension length from 3 to 5
		else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
		//validating phone number where area code is in braces ()
		else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
		//return false if nothing matches the input
		else return false;
		
	}
	
	public boolean validateName(String name) {
		if(name != null ) {
			String regexName = "\\p{Upper}(\\p{Lower}+\\s?)";
		    String patternName = "(" + regexName + "){2,3}";
		    return name.matches(patternName);
		}else {
			return false;
		}
		
	}

}
