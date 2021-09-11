package com.MGM.HospitalManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MGM.HospitalManagement.Service.ManagementService;
import com.MGM.HospitalManagement.dto.ManagementInformation;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ManagementController {

	@Autowired
	ManagementService managementService;
	
	@PostMapping(value = "mgmt/addMgmt")
	public int addManagement(@RequestBody ManagementInformation managementInformation)
	{
		return managementService.addManagement(managementInformation);
	}
	
	@DeleteMapping(value = "mgmt/deleteMgmt/{management_id}")
	public void deleteManagement(@PathVariable int management_id)
	{
		managementService.deleteManagementInformation(management_id);
	}
	
	@GetMapping(value = "mgmt/getMgmt/{management_id}")
	public ManagementInformation getManagement(int management_id)
	{
		return managementService.getManagementInformation(management_id);
	}
	
	@PutMapping(value = "mgmt/updateMgmt")
	public void modifyManagement(@RequestBody ManagementInformation managementInformation)
	{
		managementService.modifyManagementInformation(managementInformation);
	}
	
	@GetMapping(value = "mgmt/getMgmtByEmail/{management_email}")
	public ManagementInformation getManagementByEmail(@PathVariable String management_email)
	{
		return managementService.getManagementByEmail(management_email);
	}
	
}






