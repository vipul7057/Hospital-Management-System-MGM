package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.MGM.HospitalManagement.dto.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, Integer> {

	@Query(value = "select * from doctor d where d.doctor_email=?1",nativeQuery = true)
	public Doctor getDoctorByEmail(String doctor_email);
	
	@Query(value = "select * from doctor d where d.doctor_email=?1 and d.doctor_password=?2",nativeQuery = true)
	public Doctor getDoctorByEmailAndPassword(String doctor_email,String doctor_password);
}
