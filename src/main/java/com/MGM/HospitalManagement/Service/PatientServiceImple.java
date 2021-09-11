package com.MGM.HospitalManagement.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import com.MGM.HospitalManagement.MailFeature;
import com.MGM.HospitalManagement.Repo.*;
import com.MGM.HospitalManagement.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@Service
public class PatientServiceImple implements PatientService {

	@Autowired
	PatientInformationRepo patientInformationRepo;
	@Autowired
	PatientExaminationRepo patientExaminationRepo;
	@Autowired
	PatientTreatmentRepo patientTreatmentRepo;
	@Autowired
	PatientMedicinesRepo patientMedicinesRepo;
	@Autowired
	PatientTestRepo patientTestRepo;


	@Autowired
	PatientTreatment2Repo patientTreatment2Repo;
	
	@Autowired
	MedicinesRepo medicinesRepo;

	@Autowired
	private MailFeature mailFeature;

	@Override
	public int addPatientInformation(PatientInformation patientInformation) {

		PatientInformation p = patientInformationRepo.findPatientByEmail(patientInformation.getPatientEmail());

		if(p == null){
			patientInformationRepo.save(patientInformation);
//			mailFeature.send(
//					patientInformation.getPatientEmail(),
//					"MGM Hospital Management System",
//						"Your Login Id :"+patientInformation.getPatientEmail()+
//								"\n Your Password :"+patientInformation.getPatientPassword()
//					);
			return 1;
		}else{
			return 0;
		}

	}

	@Override
	public int addPatientTreatment(PatientTreatment patientTreatement) {

//		patientTreatmentRepo.save(patientTreatement);
//		return 1;
		PatientTreatment p = patientTreatmentRepo.save(patientTreatement);
		return p.getPtId();

	}

	@Override
	public int addPatientExamination(PatientExamination patientExamination) {
		patientExaminationRepo.save(patientExamination);
		return 0;
	}

	@Override
	public int addPatientMedicines(PatientMedicines patientMedicines) {
		patientMedicinesRepo.save(patientMedicines);
		return 0;
	}

	@Override
	public int addPatientTest(PatientTest patientTest) {
		patientTestRepo.save(patientTest);
		return 0;
	}

	@Override
	public PatientInformation getPatientInformation(int patientId) {
		Optional<PatientInformation> optional = patientInformationRepo.findById(patientId);
		return optional.get();
		
	}

	@Override
	public PatientExamination getPatientExamination(int peId) {
		Optional<PatientExamination> optional = patientExaminationRepo.findById(peId);
		return optional.get();
	}


	@Override
	public PatientTreatment getPatientTreatment(int ptId) {
		Optional<PatientTreatment> optional = patientTreatmentRepo.findById(ptId);
		return optional.get();
	}

	@Override
	public PatientMedicines getPatientMedicines(int pmId) {
		Optional<PatientMedicines> optional = patientMedicinesRepo.findById(pmId);
		return optional.get();
	}

	@Override
	public PatientTest getPatientTest(int pTestId) {
		Optional<PatientTest> optional = patientTestRepo.findById(pTestId);
		return optional.get();
	}

	@Override
	public List<PatientInformation> getAllPatientInformation() {
		Iterable<PatientInformation> iterable = patientInformationRepo.findAll();
		Iterator<PatientInformation> iterator = iterable.iterator();

		List<PatientInformation> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}

	@Override
	public List<PatientExamination> getAllPatientExamination() {
		Iterable<PatientExamination> iterable = patientExaminationRepo.findAll();
		Iterator<PatientExamination> iterator = iterable.iterator();

		List<PatientExamination> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}

	@Override
	public List<PatientTreatment> getAllPatientTreatment() {
		Iterable<PatientTreatment> iterable = patientTreatmentRepo.findAll();
		Iterator<PatientTreatment> iterator = iterable.iterator();

		List<PatientTreatment> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}


	@Override
	public List<PatientMedicines> getAllPatientMedicines() {
		Iterable<PatientMedicines> iterable = patientMedicinesRepo.findAll();
		Iterator<PatientMedicines> iterator = iterable.iterator();

		List<PatientMedicines> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}

	@Override
	public List<PatientTest> getAllPatientTest() {
		Iterable<PatientTest> iterable = patientTestRepo.findAll();
		Iterator<PatientTest> iterator = iterable.iterator();

		List<PatientTest> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}

	@Override
	public int deletePatientInformation(int patientId) {

		PatientInformation p = patientInformationRepo.findPatientById(patientId);
		if(p==null){
			return 1;
		}else{
			patientInformationRepo.deleteById(patientId);
			return 0;
		}


	}

	@Override
	public int deletePatientTreatment(int ptId) {
		patientInformationRepo.deleteById(ptId);
		return ptId;
	}

	@Override
	public int deletePatientMedicines(int pmId) {
		patientMedicinesRepo.deleteById(pmId);
		return pmId;
	}

	@Override
	public int deletePatientExamination(int peId) {
		patientExaminationRepo.deleteById(peId);
		return peId;
	}

	@Override
	public int deletePatientTest(int pTestId) {
		patientTestRepo.deleteById(pTestId);
		return pTestId;
	}

	@Override
	public int updatePatientInformation(PatientInformation patientInformation) {
		patientInformationRepo.save(patientInformation);
		return 0;
	}

	@Override
	public int updatePatientTreatment(PatientTreatment patientTreatement) {
		patientTreatmentRepo.save(patientTreatement);
		return 0;
	}


	@Override
	public int updatePatientExamination(PatientExamination patientExamination) {
		patientExaminationRepo.save(patientExamination);
		return 0;
	}

	@Override
	public int updatePatientMedicines(PatientMedicines patientMedicines) {
		patientMedicinesRepo.save(patientMedicines);
		return 0;
	}

	@Override
	public int updatePatientTest(PatientTest patientTest) {
		patientTestRepo.save(patientTest);
		return 0;
	}

	@Override
	public List<PatientExamination> getAllPatientExaminationByPatientId(int patientId) {
		List<PatientExamination> examineList = patientExaminationRepo.getPatientExaminationByPatientId(patientId);
		return examineList;
	}

	@Override
	public List<PatientInformation> getAllPatientInformationByNurseId(int nurseId) {
		return patientInformationRepo.getPatientInformationByNurseId(nurseId);
	}

	@Override
	public List<PatientInformation> getAllPatientInformationByDoctorId(int doctorId) {
		return patientInformationRepo.getPatientInformationByDoctorId(doctorId);
	}

	@Override
	public PatientInformation getPatientByEmailAndPassword(String patient_email, String patient_password) {
	PatientInformation patient_information = patientInformationRepo.getPatientByEmailAndPasswor(patient_email, patient_password); 
		return patient_information;
	}
	public List<PatientTreatment> getAllPatientTreatmentByPatientId(int patientId) {
		return patientTreatmentRepo.getPatientTreatmentByPatientId(patientId);
	}

	@Override
	public List<PatientMedicines> getAllPatientMedicinesByPtId(int ptId) {
		return patientMedicinesRepo.getPatientMedicinesByPtId(ptId);
	}

	@Override
	public List<PatientTest> getAllPatientTestByPtId(int ptId) {
		return patientTestRepo.getPatientTestByPtId(ptId);

	}

	@Override

	public PatientInformation getPatientByEmail(String patient_email) {
		PatientInformation objPatientInformation = patientInformationRepo.findPatientByEmail(patient_email);
		return objPatientInformation;
	}


	public List<Integer> getPtIdbyPatientId(int patientId) {
		return patientTreatmentRepo.getPatientTreatmentIdByPatientId(patientId);
	}

	@Override
	public List<Medicines> getAllMedicines() {
		Iterable<Medicines> iterable =medicinesRepo .findAll();
		Iterator<Medicines> iterator = iterable.iterator();

		List<Medicines> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}

	@Override
	public int addPatientTreatment2(PatientTreatment2 patientTreatment2) {
		patientTreatment2Repo.save(patientTreatment2 );
		return 1;
	}

	@Override
	public int deletePatientTreatment2(int pt2Id) {
		patientTreatment2Repo.deleteById(pt2Id );
		return 1;
	}

	@Override
	public List<PatientTreatment2> getAllPatientTreatment2ByPatientId(int patientId) {
		return patientTreatment2Repo.getPatientTreatmentByPatientId(patientId);
	}

	@Override

	public int deleteMedicineByPt2Id(int pt2Id) {


		Optional<PatientTreatment2> optional = patientTreatment2Repo.findById(pt2Id);
		PatientTreatment2 p = optional.get();
		if (p == null) {
			return 0;
		} else {
			patientTreatment2Repo.deleteById(pt2Id);
			return 1;
		}

	}
		public List<PatientInformation> getPatientInformationByNurseId ( int nurseId){

			return patientInformationRepo.getPatientInformationByNurseId(nurseId);

		}


}
