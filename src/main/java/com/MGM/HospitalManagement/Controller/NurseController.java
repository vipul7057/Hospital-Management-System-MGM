package com.MGM.HospitalManagement.Controller;

import java.util.List;

import javax.persistence.PersistenceUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.MGM.HospitalManagement.Service.NurseService;
import com.MGM.HospitalManagement.dto.Nurse;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class NurseController {

	@Autowired
	NurseService nurseService;
	
	@PostMapping(value = "nurse/addNurse") 
	public int addNurse(@RequestBody Nurse nurse)
	{
		return  nurseService.addNurse(nurse);
	}
	
	@GetMapping(value = "nurse/getAllNurse")
	public List<Nurse> getAllNurse()
	{
		return nurseService.getAllNurse();
	}
	
	@GetMapping(value = "nurse/getNurse/{nurse_id}")
	public Nurse getNurse(@PathVariable int nurse_id)
	{
		return nurseService.getNurse(nurse_id);
	}
	
	@DeleteMapping(value = "nurse/deleteNurse/{nurse_id}")
	public void deleteNurse(@PathVariable int nurse_id)
	{
		nurseService.deleteNurse(nurse_id);
	}
	
	@PutMapping (value = "nurse/modifyNurse")
	public void modifyNurse(@RequestBody Nurse nurse)
	{
		nurseService.modifyNurse(nurse);
	}
	
	@GetMapping(value = "nurse/nurseByEmail/{nurse_email}")
	public Nurse getNurseByEmail(@PathVariable String nurse_email)
	{
		return nurseService.getNurseByEmail(nurse_email);
	}
	
	
}
