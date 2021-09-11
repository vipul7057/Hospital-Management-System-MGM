package com.MGM.HospitalManagement.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MGM.HospitalManagement.Repo.ManagementInformationRepo;
import com.MGM.HospitalManagement.dto.ManagementInformation;

@Service
public class ManagementServiceImple implements ManagementService {

	@Autowired
	ManagementInformationRepo managementInformationRepo;
	
	@Override
	public int addManagement(ManagementInformation managementInformation) {
		
		ManagementInformation management = getManagementByEmail(managementInformation.getManagement_email());
		if(management == null)
		{
			managementInformationRepo.save(managementInformation);
			return 1;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public ManagementInformation getManagementInformation(int management_id) {
		Optional<ManagementInformation> optional = managementInformationRepo.findById(management_id);
		return optional.get();
	}

	@Override
	public List<ManagementInformation> getAllManagementInformation() {
		Iterable<ManagementInformation> iterable = managementInformationRepo.findAll();
		Iterator<ManagementInformation> iterator = iterable.iterator();
		
		List<ManagementInformation> resultList = new ArrayList<>();
		while(iterator.hasNext()) {
			resultList.add(iterator.next());
		}
		
		return resultList;
	}

	@Override
	public void deleteManagementInformation(int management_id) {
		managementInformationRepo.deleteById(management_id);
	}

	@Override
	public void modifyManagementInformation(ManagementInformation managementInformation) {
		managementInformationRepo.save(managementInformation);
	}

	@Override
	public ManagementInformation getManagementByEmail(String management_email) {
		ManagementInformation management =  managementInformationRepo.getManagementByEmail(management_email);
		//System.out.println(management.toString());
		return management;
	}

	@Override
	public ManagementInformation getManagementByEmailAndPassword(String management_email, String management_password) {
		ManagementInformation managementInformation = managementInformationRepo.getManagementByEmailAndPassword(management_email, management_password);
		
		return managementInformation;
	}

	
}
