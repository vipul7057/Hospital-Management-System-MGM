package com.MGM.HospitalManagement.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MGM.HospitalManagement.Service.DoctorService;
import com.MGM.HospitalManagement.dto.Doctor;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;
	
	@PostMapping(value = "doctor/addDoctor")
	public int addDoctor(@RequestBody Doctor doctor)
	{
		return doctorService.addDoctor(doctor);
	}
	
	
	@DeleteMapping(value = "doctor/deleteDoctor/{doctor_id}")
	public void deleteDoctor(@PathVariable int doctor_id)
	{
		doctorService.deleteDoctor(doctor_id);
	}
	
	@GetMapping(value = "doctor/getAllDoctor")
	public List<Doctor> getAllDoctor()
	{
		return doctorService.getAllDoctor();
	}
	
	@PutMapping(value = "doctor/modifyDoctor")
	public void modifyDoctor(@RequestBody Doctor doctor)
	{
		doctorService.modifyDoctor(doctor);
	}
	
	@GetMapping(value = "doctor/getDoctor/{doctor_id}")
	public Doctor getDoctor(@PathVariable int doctor_id)
	{
		return doctorService.getDoctor(doctor_id);
	}


	@GetMapping(value = "doctor/getDoctorByEmail/{doctor_email}")
	public Doctor getDoctorByEmail(@PathVariable String doctor_email)
	{
		return doctorService.getDoctorByEmail(doctor_email);
	}
	
	

}
