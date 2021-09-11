package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MGM.HospitalManagement.dto.MedicalTest;

public interface MedicalTestRepo extends JpaRepository<MedicalTest, Integer> {

}
