package com.MGM.HospitalManagement.dto;

import javax.persistence.Table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "AdminInformation")
public class AdminInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int admin_id;
	private String admin_fname;
	private String admin_lname;
	private String admin_email;
	private String admin_password;
	private String admin_phone;
	private String userRole = "admin";
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_fname() {
		return admin_fname;
	}
	public void setAdmin_fname(String admin_fname) {
		this.admin_fname = admin_fname;
	}
	public String getAdmin_lname() {
		return admin_lname;
	}
	public void setAdmin_lname(String admin_lname) {
		this.admin_lname = admin_lname;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	public String getAdmin_phone() {
		return admin_phone;
	}
	public void setAdmin_phone(String admin_phone) {
		this.admin_phone = admin_phone;
	}
	public AdminInformation(int admin_id, String admin_fname, String admin_lname, String admin_email,
			String admin_password, String admin_phone) {
		super();
		this.admin_id = admin_id;
		this.admin_fname = admin_fname;
		this.admin_lname = admin_lname;
		this.admin_email = admin_email;
		this.admin_password = admin_password;
		this.admin_phone = admin_phone;
	}
	public AdminInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "AdminInformation [admin_id=" + admin_id + ", admin_fname=" + admin_fname + ", admin_lname="
				+ admin_lname + ", admin_email=" + admin_email + ", admin_password=" + admin_password + ", admin_phone="
				+ admin_phone + "]";
	}
	
	
	
}
