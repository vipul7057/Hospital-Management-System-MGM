package com.MGM.HospitalManagement.Repo;

import com.MGM.HospitalManagement.dto.PatientTreatment;
import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientExamination;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientExaminationRepo extends JpaRepository<PatientExamination, Integer> {

    @Query(value="select * from patient_examination where patient_id = ?1",nativeQuery=true)
    public List<PatientExamination> getPatientExaminationByPatientId(int patientId);

}
