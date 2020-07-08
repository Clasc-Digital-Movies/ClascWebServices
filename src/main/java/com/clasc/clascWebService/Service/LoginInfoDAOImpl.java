package com.clasc.clascWebService.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clasc.clascWebService.Repository.LogininfoDAO;
import com.clasc.clascWebService.pojo.LoginInfo;

@Service
public class LoginInfoDAOImpl {
	
	@Autowired
	private LogininfoDAO repo;
	
	public LoginInfo saveLoginInfo(LoginInfo loginInfo) {
		return repo.save(loginInfo);
	}
	
	

}
