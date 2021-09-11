package com.MGM.HospitalManagement.dto;

import javax.persistence.*;

@Entity
@Table(name = "PatientMedicines")
public class PatientMedicines {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pmId;
    private String pmDosage;
    private String pmTime;
	private int ptId;
	private int medicineId;

	public int getPtId() {
		return ptId;
	}

	public void setPtId(int ptId) {
		this.ptId = ptId;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public int getPmId() {
		return pmId;
	}
	public void setPmId(int pmId) {
		this.pmId = pmId;
	}
	public String getPmDosage() {
		return pmDosage;
	}
	public void setPmDosage(String pmDosage) {
		this.pmDosage = pmDosage;
	}
	public String getPmTime() {
		return pmTime;
	}
	public void setPmTime(String pmTime) {
		this.pmTime = pmTime;
	}
	public PatientMedicines(int pmId, String pmDosage, String pmTime,int ptId,int medicineId) {
		super();
		this.pmId = pmId;
		this.pmDosage = pmDosage;
		this.pmTime = pmTime;
		this.ptId = ptId;
		this.medicineId = medicineId;
	}
	public PatientMedicines() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PatientMedicines [pmId=" + pmId + ", pmDosage=" + pmDosage + ", pmTime=" + pmTime + "]";
	}
    
    

}
