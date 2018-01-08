package com.jay.web.model;

import org.springframework.context.annotation.ComponentScan;

/**
 * Created by jkushwaha on 1/5/18.
 */
/* model holds all the login related data.. */
@ComponentScan
public class LoginEntity {

	private int userId;

	private String userPd;

	public LoginEntity(int userId, String userPd) {
		super();
		this.userId = userId;
		this.userPd = userPd;
	}

	public LoginEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return userPd;
	}

	public void setPassword(String pd) {
		this.userPd = pd;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		result = prime * result + ((userPd == null) ? 0 : userPd.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginEntity other = (LoginEntity) obj;
		if (userId != other.userId)
			return false;
		if (userPd == null) {
			if (other.userPd != null)
				return false;
		} else if (!userPd.equals(other.userPd))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LoginEntity [userId=" + userId + ", userPd=" + userPd + "]";
	}

}
