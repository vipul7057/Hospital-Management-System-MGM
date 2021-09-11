package com.MGM.HospitalManagement.Controller;

import java.util.List;

import com.MGM.HospitalManagement.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.MGM.HospitalManagement.dto.AdminInformation;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping(value = "admin/addAdmin")
	public int addAdmin(@RequestBody AdminInformation adminInformation)
	{
		return adminService.addAdmin(adminInformation);
	}
	
	@GetMapping(value = "admin/getAdmin/{admin_id}")
	public AdminInformation getAdmin(@PathVariable int admin_id)
	{
		return adminService.getAdminInformation(admin_id);
	}
	
	@GetMapping(value = "admin/getAllAdmin")
	public List<AdminInformation> getAllAdmin()
	{
		return adminService.getAllAdminInformation();
	}
	
	
	@DeleteMapping(value = "admin/deleteAdmin/{admin_id}")
	public void deleteAdmin(@PathVariable int admin_id)
	{
		adminService.deleteAdminInformation(admin_id);
	}
	
	
	
}
