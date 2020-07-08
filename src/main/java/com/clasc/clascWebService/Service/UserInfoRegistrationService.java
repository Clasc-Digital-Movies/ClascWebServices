package com.clasc.clascWebService.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clasc.clascWebService.Repository.UserInfoRegistrationRepository;
import com.clasc.clascWebService.pojo.LoginInfo;
import com.clasc.clascWebService.pojo.UserInfo;

@Service
public class UserInfoRegistrationService {
	
	@Autowired
	private UserInfoRegistrationRepository repo;
	
	public UserInfo saveUser(UserInfo userInfo) {
		
		 return repo.save(userInfo);
		
	}
	
	
	
	public UserInfo fetchUserByEmailId(String emailId) {
		return repo.findByEmailId(emailId);
		
	}

}
