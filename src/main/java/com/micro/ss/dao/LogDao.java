package com.micro.ss.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.micro.ss.model.UserLog;

/**
 * @author micro
 * @date 2017年7月12日
 * @description : 
 */
public interface LogDao extends MongoRepository<UserLog, Long>{
	
	List<UserLog> getByUserId(Long userId);
	
	UserLog getUserLogByLogId(Long logId);
}
