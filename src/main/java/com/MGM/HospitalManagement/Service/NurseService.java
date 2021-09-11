package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.Nurse;

public interface NurseService {
	int addNurse(Nurse nurse);

	Nurse getNurse(int nurse_id);

	List<Nurse> getAllNurse();

	void deleteNurse(int nurse_id);
	
	void modifyNurse(Nurse nurse);
	
	Nurse getNurseByEmail(String nurse_email);
	
	Nurse getNurseByEmailAndPassword(String nurse_email,String nurse_password);
}
