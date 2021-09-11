package com.MGM.HospitalManagement.Controller;

import com.MGM.HospitalManagement.Service.MedicinesService;
import com.MGM.HospitalManagement.dto.Medicines;
import com.MGM.HospitalManagement.dto.PatientExamination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MedicnesController {

    @Autowired
    MedicinesService medicinesService;


    @GetMapping(value="medicines/medicinesType")
    public List<String> getAllMedicinesType(){

        return medicinesService.getMedicineType();
    }

    @GetMapping(value="medicines/getMedcinesByType/{medicinesType}")
    public List<Medicines> getAllMedicinesByType(@PathVariable String medicinesType){

        return medicinesService.getMedicinesType(medicinesType);
    }


    @GetMapping(value="medicines/getMedcinesByPatientId/{patientId}")
    public List<Medicines> getAllMedicinesByPatientId(@PathVariable int patientId){

        return medicinesService.getMedicinesByPatientId(patientId);
    }

    @GetMapping(value="medicines/getAllMedcines")
    public List<Medicines> getAllMedicines(){

        return medicinesService.getAllMedicines();
    }


}
