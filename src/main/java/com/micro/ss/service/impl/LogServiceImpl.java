package com.micro.ss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.ss.dao.LogDao;
import com.micro.ss.model.UserLog;
import com.micro.ss.service.LogService;
import com.micro.ss.support.ServiceResult;
import com.micro.ss.utils.ObjectUtils;

/**
 * @author micro
 * @date 2017年7月12日
 * @description : 
 */
@Service
public class LogServiceImpl implements LogService {
	
	@Autowired
	private LogDao logDao;

	public ServiceResult<Object> addLog(UserLog userLog) {
		logDao.save(userLog);
		return ServiceResult.getSuccess();
	}


	public ServiceResult<List<UserLog>> getLogsById(Long userId) {
		List<UserLog> userLogList = logDao.getByUserId(userId);
		return ServiceResult.getSuccess(userLogList);
	}

	public ServiceResult<Object> updateLogByLogId(UserLog userLog) {
		UserLog u = logDao.getUserLogByLogId(userLog.getLogId());
		if (u == null) {
			return ServiceResult.getErrorResult("日志不存在");
		}
		merge(u, userLog);
		logDao.save(u);
		return ServiceResult.getSuccess();
	}
	
	private void merge(UserLog userLog, UserLog userLog2) {
		ObjectUtils.mergeObjectPropertiesByOldObjectProprioty(userLog, userLog2);
	}

}
