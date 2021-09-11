package com.MGM.HospitalManagement.dto;

import javax.persistence.*;

@Entity
@Table(name = "PatientExamination")
public class PatientExamination {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int peId;
    private String peDateTime;
    private String peHead;
    private String peNeck;
    private String peChest;
    private String peBack;
    private String peHeart;
    private String peNeuro;
    private String peAbdomen;
    private String peExtermities;
    private String peOthers;
    private String pePulse;
    private String peResp;
    private String peBp;
    private String peTemp;
    private String pePulseOx;
    private String peFSBS;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	private int patientId;
	public int getPeId() {
		return peId;
	}
	public void setPeId(int peId) {
		this.peId = peId;
	}
	public String getPeDateTime() {
		return peDateTime;
	}
	public void setPeDateTime(String peDateTime) {
		this.peDateTime = peDateTime;
	}
	public String getPeHead() {
		return peHead;
	}
	public void setPeHead(String peHead) {
		this.peHead = peHead;
	}
	public String getPeNeck() {
		return peNeck;
	}
	public void setPeNeck(String peNeck) {
		this.peNeck = peNeck;
	}
	public String getPeChest() {
		return peChest;
	}
	public void setPeChest(String peChest) {
		this.peChest = peChest;
	}
	public String getPeBack() {
		return peBack;
	}
	public void setPeBack(String peBack) {
		this.peBack = peBack;
	}
	public String getPeHeart() {
		return peHeart;
	}
	public void setPeHeart(String peHeart) {
		this.peHeart = peHeart;
	}
	public String getPeNeuro() {
		return peNeuro;
	}
	public void setPeNeuro(String peNeuro) {
		this.peNeuro = peNeuro;
	}
	public String getPeAbdomen() {
		return peAbdomen;
	}
	public void setPeAbdomen(String peAbdomen) {
		this.peAbdomen = peAbdomen;
	}
	public String getPeExtermities() {
		return peExtermities;
	}
	public void setPeExtermities(String peExtermities) {
		this.peExtermities = peExtermities;
	}
	public String getPeOthers() {
		return peOthers;
	}
	public void setPeOthers(String peOthers) {
		this.peOthers = peOthers;
	}
	public String getPePulse() {
		return pePulse;
	}
	public void setPePulse(String pePulse) {
		this.pePulse = pePulse;
	}
	public String getPeResp() {
		return peResp;
	}
	public void setPeResp(String peResp) {
		this.peResp = peResp;
	}
	public String getPeBp() {
		return peBp;
	}
	public void setPeBp(String peBp) {
		this.peBp = peBp;
	}
	public String getPeTemp() {
		return peTemp;
	}
	public void setPeTemp(String peTemp) {
		this.peTemp = peTemp;
	}
	public String getPePulseOx() {
		return pePulseOx;
	}
	public void setPePulseOx(String pePulseOx) {
		this.pePulseOx = pePulseOx;
	}
	public String getPeFSBS() {
		return peFSBS;
	}
	public void setPeFSBS(String peFSBS) {
		this.peFSBS = peFSBS;
	}
	public PatientExamination(int peId, String peDateTime, String peHead, String peNeck, String peChest, String peBack,
			String peHeart, String peNeuro, String peAbdomen, String peExtermities, String peOthers, String pePulse,
			String peResp, String peBp, String peTemp, String pePulseOx, String peFSBS,int patientId) {
		super();
		this.peId = peId;
		this.peDateTime = peDateTime;
		this.peHead = peHead;
		this.peNeck = peNeck;
		this.peChest = peChest;
		this.peBack = peBack;
		this.peHeart = peHeart;
		this.peNeuro = peNeuro;
		this.peAbdomen = peAbdomen;
		this.peExtermities = peExtermities;
		this.peOthers = peOthers;
		this.pePulse = pePulse;
		this.peResp = peResp;
		this.peBp = peBp;
		this.peTemp = peTemp;
		this.pePulseOx = pePulseOx;
		this.peFSBS = peFSBS;
		this.patientId = patientId;
	}
	public PatientExamination() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PatientExamination [peId=" + peId + ", peDateTime=" + peDateTime + ", peHead=" + peHead + ", peNeck="
				+ peNeck + ", peChest=" + peChest + ", peBack=" + peBack + ", peHeart=" + peHeart + ", peNeuro="
				+ peNeuro + ", peAbdomen=" + peAbdomen + ", peExtermities=" + peExtermities + ", peOthers=" + peOthers
				+ ", pePulse=" + pePulse + ", peResp=" + peResp + ", peBp=" + peBp + ", peTemp=" + peTemp
				+ ", pePulseOx=" + pePulseOx + ", peFSBS=" + peFSBS + "]";
	}

    

}
