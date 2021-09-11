package com.MGM.HospitalManagement.dto;

import javax.persistence.*;

@Entity
@Table(name = "PatientTest")
public class PatientTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pTestId;
    private String pTestConsultant;
    private int pTestStatus;
	private int medicalTestId;
	private int ptId;

	public int getPtId() {
		return ptId;
	}

	public void setPtId(int ptId) {
		this.ptId = ptId;
	}

	public int getpTestId() {
		return pTestId;
	}

	public void setpTestId(int pTestId) {
		this.pTestId = pTestId;
	}

	public String getpTestConsultant() {
		return pTestConsultant;
	}

	public void setpTestConsultant(String pTestConsultant) {
		this.pTestConsultant = pTestConsultant;
	}

	public int getpTestStatus() {
		return pTestStatus;
	}

	public void setpTestStatus(int pTestStatus) {
		this.pTestStatus = pTestStatus;
	}

	public int getMedicalTestId() {
		return medicalTestId;
	}

	public void setMedicalTestId(int medicalTestId) {
		this.medicalTestId = medicalTestId;
	}

	public PatientTest(int pTestId, String pTestConsultant, int pTestStatus, int medicalTestId,int ptId ) {
		this.pTestId = pTestId;
		this.pTestConsultant = pTestConsultant;
		this.pTestStatus = pTestStatus;
		this.medicalTestId = medicalTestId;
		this.ptId = ptId;
	}

	public PatientTest() {
	}

	@Override
	public String toString() {
		return "PatientTest{" +
				"pTestId=" + pTestId +
				", pTestConsultant='" + pTestConsultant + '\'' +
				", pTestStatus=" + pTestStatus +
				", medicalTestId=" + medicalTestId +
				'}';
	}
}
