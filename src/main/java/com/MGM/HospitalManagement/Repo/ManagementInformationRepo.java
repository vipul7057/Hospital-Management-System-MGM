package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.MGM.HospitalManagement.dto.Doctor;
import com.MGM.HospitalManagement.dto.ManagementInformation;

public interface ManagementInformationRepo extends JpaRepository<ManagementInformation, Integer>{

	@Query(value = "select * from management_information mgmt where mgmt.management_email=?1",nativeQuery = true)
	public ManagementInformation getManagementByEmail(String mgmt_email);
	
	@Query(value = "select * from management_information mgmt where mgmt.management_email=?1 and mgmt.management_password=?2",nativeQuery = true)
	public ManagementInformation getManagementByEmailAndPassword(String mgmt_email,String mgmt_password);

	
}
