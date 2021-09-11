package com.MGM.HospitalManagement.dto;

import javax.persistence.*;

@Entity
@Table(name = "PatientInformation")
public class PatientInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int patientId;
    private String patientFName;
    private String patientLName;
    private String patientEmail;
    private String patientPassword;
    private String patientAddress;
    private String patientTempAddress;
    private String patientCity;
    private String patientZipCode;
    private String patientState;
    private String patientGender;
    private String patientDOB;
    private String patientPhone;
    private String patientWeight;
    private String patientTriage;
    private String patientLMP;
    //change
    private String patientComplaint;
    //change
    private String patientAllergies;
    //change
    private String patientMedicalHistory;
    private String patientSID;
    private String patientOPD;
    private String patientIPD;
    private String patientWard;
    private String patientBedNo;
    public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	private String userRole = "patient";
    private int doctorId;
    private int nurseId;

	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientFName() {
		return patientFName;
	}
	public void setPatientFName(String patientFName) {
		this.patientFName = patientFName;
	}
	public String getPatientLName() {
		return patientLName;
	}
	public void setPatientLName(String patientLName) {
		this.patientLName = patientLName;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}
	public String getPatientPassword() {
		return patientPassword;
	}
	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientTempAddress() {
		return patientTempAddress;
	}
	public void setPatientTempAddress(String patientTempAddress) {
		this.patientTempAddress = patientTempAddress;
	}
	public String getPatientCity() {
		return patientCity;
	}
	public void setPatientCity(String patientCity) {
		this.patientCity = patientCity;
	}
	public String getPatientZipCode() {
		return patientZipCode;
	}
	public void setPatientZipCode(String patientZipCode) {
		this.patientZipCode = patientZipCode;
	}
	public String getPatientState() {
		return patientState;
	}
	public void setPatientState(String patientState) {
		this.patientState = patientState;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public String getPatientDOB() {
		return patientDOB;
	}
	public void setPatientDOB(String patientDOB) {
		this.patientDOB = patientDOB;
	}
	public String getPatientPhone() {
		return patientPhone;
	}
	public void setPatientPhone(String patientPhone) {
		this.patientPhone = patientPhone;
	}
	public String getPatientWeight() {
		return patientWeight;
	}
	public void setPatientWeight(String patientWeight) {
		this.patientWeight = patientWeight;
	}
	public String getPatientTriage() {
		return patientTriage;
	}
	public void setPatientTriage(String patientTriage) {
		this.patientTriage = patientTriage;
	}
	public String getPatientLMP() {
		return patientLMP;
	}
	public void setPatientLMP(String patientLMP) {
		this.patientLMP = patientLMP;
	}
	public String getPatientComplaint() {
		return patientComplaint;
	}
	public void setPatientComplaint(String patientComplaint) {
		this.patientComplaint = patientComplaint;
	}
	public String getPatientAllergies() {
		return patientAllergies;
	}
	public void setPatientAllergies(String patientAllergies) {
		this.patientAllergies = patientAllergies;
	}
	public String getPatientMedicalHistory() {
		return patientMedicalHistory;
	}
	public void setPatientMedicalHistory(String patientMedicalHistory) {
		this.patientMedicalHistory = patientMedicalHistory;
	}
	public String getPatientSID() {
		return patientSID;
	}
	public void setPatientSID(String patientSID) {
		this.patientSID = patientSID;
	}
	public String getPatientOPD() {
		return patientOPD;
	}
	public void setPatientOPD(String patientOPD) {
		this.patientOPD = patientOPD;
	}
	public String getPatientIPD() {
		return patientIPD;
	}
	public void setPatientIPD(String patientIPD) {
		this.patientIPD = patientIPD;
	}
	public String getPatientWard() {
		return patientWard;
	}
	public void setPatientWard(String patientWard) {
		this.patientWard = patientWard;
	}
	public String getPatientBedNo() {
		return patientBedNo;
	}
	public void setPatientBedNo(String patientBedNo) {
		this.patientBedNo = patientBedNo;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public int getNurseId() {
		return nurseId;
	}
	public void setNurseId(int nurseId) {
		this.nurseId = nurseId;
	}
	
	public PatientInformation(int patientId, String patientFName, String patientLName, String patientEmail,
			String patientPassword, String patientAddress, String patientTempAddress, String patientCity,
			String patientZipCode, String patientState, String patientGender, String patientDOB, String patientPhone,
			String patientWeight, String patientTriage, String patientLMP, String patientComplaint,
			String patientAllergies, String patientMedicalHistory, String patientSID, String patientOPD,
			String patientIPD, String patientWard, String patientBedNo, String userRole, int doctorId, int nurseId) {
		super();
		this.patientId = patientId;
		this.patientFName = patientFName;
		this.patientLName = patientLName;
		this.patientEmail = patientEmail;
		this.patientPassword = patientPassword;
		this.patientAddress = patientAddress;
		this.patientTempAddress = patientTempAddress;
		this.patientCity = patientCity;
		this.patientZipCode = patientZipCode;
		this.patientState = patientState;
		this.patientGender = patientGender;
		this.patientDOB = patientDOB;
		this.patientPhone = patientPhone;
		this.patientWeight = patientWeight;
		this.patientTriage = patientTriage;
		this.patientLMP = patientLMP;
		this.patientComplaint = patientComplaint;
		this.patientAllergies = patientAllergies;
		this.patientMedicalHistory = patientMedicalHistory;
		this.patientSID = patientSID;
		this.patientOPD = patientOPD;
		this.patientIPD = patientIPD;
		this.patientWard = patientWard;
		this.patientBedNo = patientBedNo;
		this.userRole = userRole;
		this.doctorId = doctorId;
		this.nurseId = nurseId;
	}
	public PatientInformation() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PatientInformation [patientId=" + patientId + ", patientFName=" + patientFName + ", patientLName="
				+ patientLName + ", patientEmail=" + patientEmail + ", patientPassword=" + patientPassword
				+ ", patientAddress=" + patientAddress + ", patientTempAddress=" + patientTempAddress + ", patientCity="
				+ patientCity + ", patientZipCode=" + patientZipCode + ", patientState=" + patientState
				+ ", patientGender=" + patientGender + ", patientDOB=" + patientDOB + ", patientPhone=" + patientPhone
				+ ", patientWeight=" + patientWeight + ", patientTriage=" + patientTriage + ", patientLMP=" + patientLMP
				+ ", patientComplaint=" + patientComplaint + ", patientAllergies=" + patientAllergies
				+ ", patientMedicalHistory=" + patientMedicalHistory + ", patientSID=" + patientSID + ", patientOPD="
				+ patientOPD + ", patientIPD=" + patientIPD + ", patientWard=" + patientWard + ", patientBedNo="
				+ patientBedNo + ", userRole=" + userRole + ", doctorId=" + doctorId + ", nurseId=" + nurseId + "]";
	}
    
    
    




}
