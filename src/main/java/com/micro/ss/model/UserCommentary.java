package com.micro.ss.model;

import org.springframework.data.annotation.Id;

/**
 * @author micro
 * @date 2017年7月12日
 * @description :
 */
public class UserCommentary {

	@Id
	private Long id;

	private Long commentaryId;

	private String commentary;

	private Long userId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCommentaryId() {
		return commentaryId;
	}

	public void setCommentaryId(Long commentaryId) {
		this.commentaryId = commentaryId;
	}

	public String getCommentary() {
		return commentary;
	}

	public void setCommentary(String commentary) {
		this.commentary = commentary;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserCommentary [id=" + id + ", commentaryId=" + commentaryId + ", commentary=" + commentary
				+ ", userId=" + userId + "]";
	}

}
