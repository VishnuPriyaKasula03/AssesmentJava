package com.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

//Model --->UI Data
public class User {
	private int userId;
	@NotEmpty(message="Empty username is not allowed")//By default gives a message
	private String userName;
	@Size(min=5,max=8,message="Password must be between 5 to 8")
	private String password;

	public User() {
		super();
	}

	public User(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
