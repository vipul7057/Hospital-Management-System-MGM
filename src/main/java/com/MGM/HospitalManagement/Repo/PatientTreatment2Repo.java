package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientTreatment;
import com.MGM.HospitalManagement.dto.PatientTreatment2;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientTreatment2Repo  extends JpaRepository<PatientTreatment2, Integer>{

    @Query(value="select * from patient_treatment2 where patient_id = ?1",nativeQuery=true)
    public List<PatientTreatment2> getPatientTreatmentByPatientId(int patientId);



}
