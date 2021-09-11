package com.MGM.HospitalManagement.dto;


import javax.persistence.*;

@Entity
@Table(name = "MedicalTest")
public class MedicalTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medicalTestId;
    private int medicalTestName;
    private int medicalTestDesc;
	public MedicalTest(int medicalTestId, int medicalTestName, int medicalTestDesc) {
		super();
		this.medicalTestId = medicalTestId;
		this.medicalTestName = medicalTestName;
		this.medicalTestDesc = medicalTestDesc;
	}
	public MedicalTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMedicalTestId() {
		return medicalTestId;
	}
	public void setMedicalTestId(int medicalTestId) {
		this.medicalTestId = medicalTestId;
	}
	public int getMedicalTestName() {
		return medicalTestName;
	}
	public void setMedicalTestName(int medicalTestName) {
		this.medicalTestName = medicalTestName;
	}
	public int getMedicalTestDesc() {
		return medicalTestDesc;
	}
	public void setMedicalTestDesc(int medicalTestDesc) {
		this.medicalTestDesc = medicalTestDesc;
	}

    
}
