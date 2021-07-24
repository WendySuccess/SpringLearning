package com.wendy.models;

public class User {
	public int userId;
	public String userName;
	public String userEmail;
	
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
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	
	
	
}
