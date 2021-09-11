package com.MGM.HospitalManagement.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.MGM.HospitalManagement.dto.AdminInformation;

public interface AdminRepo extends JpaRepository<AdminInformation, Integer> {

	@Query(value = "select * from Admin_information ad where ad.admin_email=?1",nativeQuery = true)
	public AdminInformation getAdminByEmail(String admin_email);
	
	@Query(value = "select * from Admin_information ad where ad.admin_email=?1 and ad.admin_password=?2",nativeQuery = true)
	public AdminInformation getAdminByEmailAndPassword(String admin_email,String admin_password);
}
