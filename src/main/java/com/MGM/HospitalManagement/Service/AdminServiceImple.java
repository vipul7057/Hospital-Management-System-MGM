package com.MGM.HospitalManagement.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.MGM.HospitalManagement.Repo.AdminRepo;
import com.MGM.HospitalManagement.dto.AdminInformation;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImple implements AdminService {

	@Autowired
	AdminRepo adminRepo;

	@Override
	public int addAdmin(AdminInformation adminInformation) {

		AdminInformation admin =  getAdminByEmail(adminInformation.getAdmin_email());
		if(admin == null)
		{
			adminRepo.save(adminInformation);
			return 1;
		}
		else
		{
			return 0;
		}

	}

	@Override
	public AdminInformation getAdminInformation(int admin_id) {
		Optional<AdminInformation> optional = adminRepo.findById(admin_id);
		return optional.get();

	}

	@Override
	public void deleteAdminInformation(int admin_id) {
		adminRepo.deleteById(admin_id);
	}

	@Override
	public List<AdminInformation> getAllAdminInformation() {
		Iterable<AdminInformation> iterable = adminRepo.findAll();
		Iterator<AdminInformation> iterator = iterable.iterator();

		List<AdminInformation> resultList = new ArrayList<>();
		while (iterator.hasNext()) {
			resultList.add(iterator.next());
		}

		return resultList;
	}

	@Override
	public AdminInformation getAdminByEmail(String admin_email) {
		AdminInformation adminPresent =  adminRepo.getAdminByEmail(admin_email);
		return adminPresent;
	}

	@Override
	public AdminInformation getAdminByEmailAndPass(String admin_email,String admin_password) {
		AdminInformation adminPresent =  adminRepo.getAdminByEmailAndPassword(admin_email, admin_password);
		return adminPresent;
	}

	

}
