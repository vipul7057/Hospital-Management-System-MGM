package com.MGM.HospitalManagement.dto;

import javax.persistence.*;

@Entity
@Table(name = "Nurse")
public class Nurse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nurseId;
    private String nurseFName;
    private String nurseLName;
    private String nurseEmail;
    private String nursePassword;
    private String nursePhone;
    private String nurseAddress;
    private String nurseCity;
    private String nurseZipCode;
    private String nurseState;
    private String nurseGender;
    private String nurseDOB;
    private String nurseQualification;
    private double nurseExperience;
    private String userRole = "nurse";
	public int getNurseId() {
		return nurseId;
	}
	public void setNurseId(int nurseId) {
		this.nurseId = nurseId;
	}
	public String getNurseFName() {
		return nurseFName;
	}
	public void setNurseFName(String nurseFName) {
		this.nurseFName = nurseFName;
	}
	public String getNurseLName() {
		return nurseLName;
	}
	public void setNurseLName(String nurseLName) {
		this.nurseLName = nurseLName;
	}
	public String getNurseEmail() {
		return nurseEmail;
	}
	public void setNurseEmail(String nurseEmail) {
		this.nurseEmail = nurseEmail;
	}
	public String getNursePassword() {
		return nursePassword;
	}
	public void setNursePassword(String nursePassword) {
		this.nursePassword = nursePassword;
	}
	public String getNursePhone() {
		return nursePhone;
	}
	public void setNursePhone(String nursePhone) {
		this.nursePhone = nursePhone;
	}
	public String getNurseAddress() {
		return nurseAddress;
	}
	public void setNurseAddress(String nurseAddress) {
		this.nurseAddress = nurseAddress;
	}
	public String getNurseCity() {
		return nurseCity;
	}
	public void setNurseCity(String nurseCity) {
		this.nurseCity = nurseCity;
	}
	public String getNurseZipCode() {
		return nurseZipCode;
	}
	public void setNurseZipCode(String nurseZipCode) {
		this.nurseZipCode = nurseZipCode;
	}
	public String getNurseState() {
		return nurseState;
	}
	public void setNurseState(String nurseState) {
		this.nurseState = nurseState;
	}
	public String getNurseGender() {
		return nurseGender;
	}
	public void setNurseGender(String nurseGender) {
		this.nurseGender = nurseGender;
	}
	public String getNurseDOB() {
		return nurseDOB;
	}
	public void setNurseDOB(String nurseDOB) {
		this.nurseDOB = nurseDOB;
	}
	public String getNurseQualification() {
		return nurseQualification;
	}
	public void setNurseQualification(String nurseQualification) {
		this.nurseQualification = nurseQualification;
	}
	public double getNurseExperience() {
		return nurseExperience;
	}
	public void setNurseExperience(double nurseExperience) {
		this.nurseExperience = nurseExperience;
	}
	
	public Nurse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Nurse [nurseId=" + nurseId + ", nurseFName=" + nurseFName + ", nurseLName=" + nurseLName
				+ ", nurseEmail=" + nurseEmail + ", nursePassword=" + nursePassword + ", nursePhone=" + nursePhone
				+ ", nurseAddress=" + nurseAddress + ", nurseCity=" + nurseCity + ", nurseZipCode=" + nurseZipCode
				+ ", nurseState=" + nurseState + ", nurseGender=" + nurseGender + ", nurseDOB=" + nurseDOB
				+ ", nurseQualification=" + nurseQualification + ", nurseExperience=" + nurseExperience + ", userRole="
				+ userRole + "]";
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public Nurse(int nurseId, String nurseFName, String nurseLName, String nurseEmail, String nursePassword,
			String nursePhone, String nurseAddress, String nurseCity, String nurseZipCode, String nurseState,
			String nurseGender, String nurseDOB, String nurseQualification, double nurseExperience, String userRole) {
		super();
		this.nurseId = nurseId;
		this.nurseFName = nurseFName;
		this.nurseLName = nurseLName;
		this.nurseEmail = nurseEmail;
		this.nursePassword = nursePassword;
		this.nursePhone = nursePhone;
		this.nurseAddress = nurseAddress;
		this.nurseCity = nurseCity;
		this.nurseZipCode = nurseZipCode;
		this.nurseState = nurseState;
		this.nurseGender = nurseGender;
		this.nurseDOB = nurseDOB;
		this.nurseQualification = nurseQualification;
		this.nurseExperience = nurseExperience;
		this.userRole = userRole;
	}
	
    
	
    

}
