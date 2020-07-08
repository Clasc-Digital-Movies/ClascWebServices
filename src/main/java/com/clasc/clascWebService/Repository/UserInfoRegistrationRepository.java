package com.clasc.clascWebService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clasc.clascWebService.pojo.UserInfo;

public interface UserInfoRegistrationRepository extends JpaRepository<UserInfo,Integer> {
	
	public UserInfo findByEmailId(String emailID);

}
