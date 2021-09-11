package com.MGM.HospitalManagement.dto;

import javax.persistence.*;

@Entity
@Table(name = "Medicines")
public class Medicines {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int medicineId;
    private String medicineName;
    private String medicineDesc;
    private String medicineType;

	public int getMedicineId() {
		return medicineId;
	}
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	public String getMedicineName() {
		return medicineName;
	}
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	public String getMedicineDesc() {
		return medicineDesc;
	}
	public void setMedicineDesc(String medicineDesc) {
		this.medicineDesc = medicineDesc;
	}
	public String getMedicineType() {
		return medicineType;
	}
	public void setMedicineType(String medicineType) {
		this.medicineType = medicineType;
	}
	public Medicines(int medicineId, String medicineName, String medicineDesc, String medicineType) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicineDesc = medicineDesc;
		this.medicineType = medicineType;
	}
	public Medicines() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Medicines [medicineId=" + medicineId + ", medicineName=" + medicineName + ", medicineDesc="
				+ medicineDesc + ", medicineType=" + medicineType + "]";
	}

    


}
