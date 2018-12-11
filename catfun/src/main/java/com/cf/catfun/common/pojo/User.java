package com.cf.catfun.common.pojo;

import java.util.Date;

/**
 * 
 * @author ljp
 *
 */
public class User {

	private Integer userId;
	private int phnoeNumber;
	private String password;

	public User(int phnoeNumber, String password) {
		super();
		this.phnoeNumber = phnoeNumber;
		this.password = password;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public int getPhnoeNumber() {
		return phnoeNumber;
	}

	public void setPhnoeNumber(int phnoeNumber) {
		this.phnoeNumber = phnoeNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
