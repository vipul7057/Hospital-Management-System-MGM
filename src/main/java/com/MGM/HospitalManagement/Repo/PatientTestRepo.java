package com.MGM.HospitalManagement.Repo;

import com.MGM.HospitalManagement.dto.PatientMedicines;
import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.PatientTest;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientTestRepo extends JpaRepository<PatientTest, Integer> {

    @Query(value="select * from patient_test where pt_id = ?1",nativeQuery=true)
    public List<PatientTest> getPatientTestByPtId(int ptId);


}
