package com.MGM.HospitalManagement.Service;

import java.util.List;

import com.MGM.HospitalManagement.dto.ManagementInformation;


public interface ManagementService {

	int addManagement(ManagementInformation managementInformation);

	ManagementInformation getManagementInformation(int management_id);

	List<ManagementInformation> getAllManagementInformation();

	void deleteManagementInformation(int management_id);
	
	void modifyManagementInformation(ManagementInformation managementInformation);
	
	ManagementInformation getManagementByEmail(String management_email);
	
	ManagementInformation getManagementByEmailAndPassword(String management_email,String management_password);
}
