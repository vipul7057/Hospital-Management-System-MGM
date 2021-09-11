package com.MGM.HospitalManagement.dto;

public class UserLogin {

	private String userEmail;
	private String userPassword;
	private String userRole;

	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public UserLogin(String userEmail, String userPassword, String userRole) {
		super();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userRole = userRole;
	}
	public UserLogin() {
		super();
	}
	@Override
	public String toString() {
		return "UserLogin [userEmail=" + userEmail + ", userPassword=" + userPassword + ", userRole=" + userRole + "]";
	}
	
	
	
}
