package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientInformation;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientInformationRepo extends JpaRepository<PatientInformation, Integer> {

    @Query(value="select * from patient_information where patient_email = ?1 limit 1 ",nativeQuery=true)
    public PatientInformation findPatientByEmail(String patientEmail);

    @Query(value="select * from patient_information where patient_id = ?1  ",nativeQuery=true)
    public PatientInformation findPatientById(int patientId);

    @Query(value="select * from patient_information where nurse_id = ?1 ",nativeQuery=true)
    public List<PatientInformation> getPatientInformationByNurseId(int nurseId);

    @Query(value="select * from patient_information where doctor_id = ?1  ",nativeQuery=true)
    public List<PatientInformation> getPatientInformationByDoctorId(int doctorId);

    @Query(value="select * from patient_information where patient_email =?1 and patient_password = ?2",nativeQuery=true)
    public PatientInformation getPatientByEmailAndPasswor(String patientEmail,String patientPassword);
    
}
