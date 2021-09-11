package com.MGM.HospitalManagement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "ManagementInformation") 
public class ManagementInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int management_id;
	private String management_fname;
	private String management_lname;
	private String management_email;
	private String management_password;
	private String management_phone;
	private String userRole = "mgmt";
	public int getManagement_id() {
		return management_id;
	}
	public void setManagement_id(int management_id) {
		this.management_id = management_id;
	}
	public String getManagement_fname() {
		return management_fname;
	}
	public void setManagement_fname(String management_fname) {
		this.management_fname = management_fname;
	}
	public String getManagement_lname() {
		return management_lname;
	}
	public void setManagement_lname(String management_lname) {
		this.management_lname = management_lname;
	}
	public String getManagement_email() {
		return management_email;
	}
	public void setManagement_email(String management_email) {
		this.management_email = management_email;
	}
	public String getManagement_password() {
		return management_password;
	}
	public void setManagement_password(String management_password) {
		this.management_password = management_password;
	}
	public String getManagement_phone() {
		return management_phone;
	}
	public void setManagement_phone(String management_phone) {
		this.management_phone = management_phone;
	}
	
	public ManagementInformation(int management_id, String management_fname, String management_lname,
			String management_email, String management_password, String management_phone, String userRole) {
		super();
		this.management_id = management_id;
		this.management_fname = management_fname;
		this.management_lname = management_lname;
		this.management_email = management_email;
		this.management_password = management_password;
		this.management_phone = management_phone;
		this.userRole = userRole;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public ManagementInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ManagementInformation [management_id=" + management_id + ", management_fname=" + management_fname
				+ ", management_lname=" + management_lname + ", management_email=" + management_email
				+ ", management_password=" + management_password + ", management_phone=" + management_phone
				+ ", userRole=" + userRole + "]";
	}
	
	
}
