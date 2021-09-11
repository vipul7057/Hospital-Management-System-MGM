package com.MGM.HospitalManagement.Repo;

import com.MGM.HospitalManagement.dto.PatientTreatment;
import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientMedicines;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientMedicinesRepo extends JpaRepository<PatientMedicines, Integer>{

    @Query(value="select * from patient_medicines where pt_id = ?1",nativeQuery=true)
    public List<PatientMedicines> getPatientMedicinesByPtId(int ptId);



}
