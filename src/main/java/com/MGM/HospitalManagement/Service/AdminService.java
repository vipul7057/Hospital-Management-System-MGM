package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.AdminInformation;

public interface AdminService {

	int addAdmin(AdminInformation adminInformation);

	AdminInformation getAdminInformation(int admin_id);

	List<AdminInformation> getAllAdminInformation();

	void deleteAdminInformation(int admin_id);
	
	AdminInformation getAdminByEmail(String admin_email);
	
	AdminInformation getAdminByEmailAndPass(String admin_email,String admin_password);
}
