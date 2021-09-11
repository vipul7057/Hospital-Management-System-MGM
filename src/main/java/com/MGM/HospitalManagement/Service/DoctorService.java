package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.Doctor;

public interface DoctorService {

	int addDoctor(Doctor doctor);

	Doctor getDoctor(int doctor_id);

	List<Doctor> getAllDoctor();

	void deleteDoctor(int doctor_id);
	
	void modifyDoctor(Doctor doctor);
	
	Doctor getDoctorByEmail(String doctor_email);
	
	Doctor getDoctorByEmailAndPassword(String doctor_email,String doctor_password);
	
}
