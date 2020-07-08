package com.clasc.clascWebService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clasc.clascWebService.pojo.LoginInfo;

public interface LogininfoDAO extends JpaRepository<LoginInfo,Integer> {
	
	
}
