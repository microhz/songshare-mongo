package com.micro.ss.model;

import org.springframework.data.annotation.Id;

/**
 * @author micro
 * @date 2017年7月12日
 * @description :
 */
public class UserLog {

	@Id
	private Long id;

	private String userId;

	private String content;

	private Long logId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}

	@Override
	public String toString() {
		return "UserLog [id=" + id + ", userId=" + userId + ", content=" + content + ", logId=" + logId + "]";
	}

}
