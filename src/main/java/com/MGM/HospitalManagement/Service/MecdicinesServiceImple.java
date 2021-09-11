package com.MGM.HospitalManagement.Service;

import com.MGM.HospitalManagement.Repo.MedicinesRepo;
import com.MGM.HospitalManagement.dto.Medicines;
import com.MGM.HospitalManagement.dto.PatientTreatment2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class MecdicinesServiceImple implements MedicinesService {
    @Autowired
    MedicinesRepo medicinesRepo;

    @Override
    public List<String> getMedicineType() {
        return medicinesRepo.getMedicinesType();
    }

    @Override
    public List<Medicines> getMedicinesType(String medicineType) {
        return medicinesRepo.getMedicinesByType(medicineType);
    }

    @Override
    public List<Medicines> getMedicinesByPatientId(int patientId) {
        return medicinesRepo.getMedicinesBySubQuery(patientId);
    }

    @Override
    public List<Medicines> getAllMedicines() {
        Iterable<Medicines> iterable =medicinesRepo.findAll();
        Iterator<Medicines> iterator = iterable.iterator();

        List<Medicines> resultList = new ArrayList<>();
        while(iterator.hasNext()) {
            resultList.add(iterator.next());
        }

        return resultList;
    }
}
