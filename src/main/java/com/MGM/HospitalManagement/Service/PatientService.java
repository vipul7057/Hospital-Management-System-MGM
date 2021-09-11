package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.*;

import javax.mail.MessagingException;

public interface PatientService {

	int addPatientInformation(PatientInformation patientInformation);

	int addPatientTreatment(PatientTreatment patientTreatement);

	int addPatientExamination(PatientExamination patientExamination);

	int addPatientMedicines(PatientMedicines patientMedicines);

	int addPatientTest(PatientTest patientTest);

	PatientInformation getPatientInformation(int patientId);

	PatientExamination getPatientExamination(int peId);

	PatientTreatment getPatientTreatment(int patientId);

	PatientMedicines getPatientMedicines(int pmId);

	PatientTest getPatientTest(int pTestId);

	List<PatientInformation> getAllPatientInformation();

	List<PatientExamination> getAllPatientExamination();

	List<PatientTreatment> getAllPatientTreatment();

	List<PatientMedicines> getAllPatientMedicines();

	List<PatientTest> getAllPatientTest();

	int deletePatientInformation(int patientId);

	int deletePatientTreatment(int ptId);

	int deletePatientMedicines(int pmId);

	int deletePatientExamination(int peId);

	int deletePatientTest(int pTestId);

	int updatePatientInformation(PatientInformation patientInformation);

	int updatePatientTreatment(PatientTreatment patientTreatement);

	int updatePatientExamination(PatientExamination patientExamination);

	int updatePatientMedicines(PatientMedicines patientMedicines);

	int updatePatientTest(PatientTest patientTest);

	List<PatientExamination> getAllPatientExaminationByPatientId(int patientId);

	List<PatientInformation> getAllPatientInformationByNurseId(int nurseId);

	List<PatientInformation> getAllPatientInformationByDoctorId(int doctorId);

	
	PatientInformation getPatientByEmailAndPassword(String patient_email,String patient_password);

	PatientInformation getPatientByEmail(String patient_email);
	
	List<PatientTreatment> getAllPatientTreatmentByPatientId(int patientId);

	List<PatientMedicines> getAllPatientMedicinesByPtId(int ptId);

	List<PatientTest> getAllPatientTestByPtId(int ptId);

	List<Integer> getPtIdbyPatientId(int patientId);
	
	List<Medicines> getAllMedicines();
	
	int addPatientTreatment2(PatientTreatment2 patientTreatment2 );
	
	int deletePatientTreatment2(int pt2Id);
	
	List<PatientTreatment2> getAllPatientTreatment2ByPatientId(int patientId);


	int deleteMedicineByPt2Id(int pt2Id);

	List<PatientInformation> getPatientInformationByNurseId(int nurseId);

}
