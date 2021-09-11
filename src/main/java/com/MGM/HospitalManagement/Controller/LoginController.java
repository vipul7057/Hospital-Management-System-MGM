package com.MGM.HospitalManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MGM.HospitalManagement.Service.AdminService;
import com.MGM.HospitalManagement.Service.DoctorService;
import com.MGM.HospitalManagement.Service.ManagementService;
import com.MGM.HospitalManagement.Service.NurseService;
import com.MGM.HospitalManagement.Service.PatientService;
import com.MGM.HospitalManagement.dto.AdminInformation;
import com.MGM.HospitalManagement.dto.Doctor;
import com.MGM.HospitalManagement.dto.ManagementInformation;
import com.MGM.HospitalManagement.dto.Nurse;
import com.MGM.HospitalManagement.dto.PatientInformation;
import com.MGM.HospitalManagement.dto.UserLogin;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LoginController {

	@Autowired
	AdminService adminService;
	
	@Autowired
	DoctorService doctorService;
	
	@Autowired
	ManagementService managementService;
	
	@Autowired
	NurseService nurseService;
	
	@Autowired
	PatientService patientService;
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/userLogin")
	public UserLogin checkUserEmail(@RequestBody UserLogin userLogin)
	{
		UserLogin user = new UserLogin();
		String user_email = userLogin.getUserEmail();
		String user_password = userLogin.getUserPassword();
		
		
		AdminInformation adminInformation =  adminService.getAdminByEmailAndPass(user_email, user_password);
		
		Doctor doctor = doctorService.getDoctorByEmailAndPassword(user_email, user_password);
		
		ManagementInformation mgmt = managementService.getManagementByEmailAndPassword(user_email, user_password);
		
		Nurse nurse = nurseService.getNurseByEmailAndPassword(user_email, user_password);
		
		PatientInformation patientInformation = patientService.getPatientByEmailAndPassword(user_email, user_password);
		
		if(adminInformation != null )
		{
			user.setUserEmail(adminInformation.getAdmin_email());
			user.setUserPassword(adminInformation.getAdmin_password());
			user.setUserRole("admin");
			return user;	
		}
		if(doctor != null)
		{
			user.setUserEmail(doctor.getDoctorEmail());
			user.setUserPassword(doctor.getDoctorPassword());
			user.setUserRole("doctor");
			return user;
		}
		if(mgmt != null)
		{
			user.setUserEmail(mgmt.getManagement_email());
			user.setUserPassword(mgmt.getManagement_password());
			user.setUserRole("management");
			return user;
		}
		if(nurse != null)
		{
			user.setUserEmail(nurse.getNurseEmail());
			user.setUserPassword(nurse.getNursePassword());
			user.setUserRole("Nurse");
			return user;
		}
		if(patientInformation != null)
		{
			user.setUserEmail(patientInformation.getPatientEmail());
			user.setUserPassword(patientInformation.getPatientPassword());
			user.setUserRole("patient");
			return user;
		}
		else
		{
			user.setUserRole("No User");
			return user;
		}
		
	}
	
}









