package com.MGM.HospitalManagement.Service;

import com.MGM.HospitalManagement.dto.Medicines;

import java.util.List;

public interface MedicinesService {

    public List<String> getMedicineType();

    public List<Medicines> getMedicinesType(String medicineType);

    public List<Medicines> getMedicinesByPatientId(int patientId);

    public List<Medicines> getAllMedicines();


}
