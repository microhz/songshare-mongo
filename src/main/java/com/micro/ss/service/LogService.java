package com.micro.ss.service;
/**
 * @author micro
 * @date 2017年7月12日
 * @description : 
 */

import java.util.List;

import com.micro.ss.model.UserLog;
import com.micro.ss.support.ServiceResult;

public interface LogService {
	ServiceResult<Object> addLog(UserLog userLog);
	
	ServiceResult<List<UserLog>> getLogsById(Long userId);
	
	ServiceResult<Object> updateLogByLogId(UserLog userLog);
}
