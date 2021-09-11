package com.MGM.HospitalManagement.dto;

import javax.persistence.*;

@Entity
@Table(name = "PatientTreatment")
public class PatientTreatment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ptId;
    private String ptNurseNote;
    private String ptMDNote;
    private String ptDoctorNote;
    private String ptOthers;
	private int patientId;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getPtId() {
		return ptId;
	}
	public void setPtId(int ptId) {
		this.ptId = ptId;
	}
	public String getPtNurseNote() {
		return ptNurseNote;
	}
	public void setPtNurseNote(String ptNurseNote) {
		this.ptNurseNote = ptNurseNote;
	}
	public String getPtMDNote() {
		return ptMDNote;
	}
	public void setPtMDNote(String ptMDNote) {
		this.ptMDNote = ptMDNote;
	}
	public String getPtDoctorNote() {
		return ptDoctorNote;
	}
	public void setPtDoctorNote(String ptDoctorNote) {
		this.ptDoctorNote = ptDoctorNote;
	}
	public String getPtOthers() {
		return ptOthers;
	}
	public void setPtOthers(String ptOthers) {
		this.ptOthers = ptOthers;
	}
	public PatientTreatment(int ptId, String ptNurseNote, String ptMDNote, String ptDoctorNote, String ptOthers,int patientId) {
		super();
		this.ptId = ptId;
		this.ptNurseNote = ptNurseNote;
		this.ptMDNote = ptMDNote;
		this.ptDoctorNote = ptDoctorNote;
		this.ptOthers = ptOthers;
		this.patientId = patientId;
	}
	public PatientTreatment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PatientTreatment [ptId=" + ptId + ", ptNurseNote=" + ptNurseNote + ", ptMDNote=" + ptMDNote
				+ ", ptDoctorNote=" + ptDoctorNote + ", ptOthers=" + ptOthers + "]";
	}
    


}
