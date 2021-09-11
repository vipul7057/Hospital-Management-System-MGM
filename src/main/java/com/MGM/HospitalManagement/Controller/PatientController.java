package com.MGM.HospitalManagement.Controller;

import com.MGM.HospitalManagement.Service.MedicinesService;
import com.MGM.HospitalManagement.Service.PatientService;
import com.MGM.HospitalManagement.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.DomainEvents;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @Autowired
    private MedicinesService medicinesService;

    @PostMapping(value="patient/addPatientInformation")
    public int addPatientInformation(@RequestBody PatientInformation patientInformation)
    {
        int i = patientService.addPatientInformation(patientInformation);
        return i ;
    }

    
    @PostMapping(value="patient/addPatientExamination")
    public int  addPatientExamination(@RequestBody PatientExamination patientExamination){
       return patientService.addPatientExamination(patientExamination);
    }

    @PostMapping(value="patient/addPatientTreatment")
    public int addPatientTreatment(@RequestBody PatientTreatment patientTreatment){
      int i =  patientService.addPatientTreatment(patientTreatment);
      return i ;
    }

    @PostMapping(value="patient/addPatientMedicines")
    public void addPatientMedicines(@RequestBody PatientMedicines patientMedicines){
    	
        patientService.addPatientMedicines(patientMedicines);
    }

    @PostMapping(value="patient/addPatientTest")
    public void addPatientTest(@RequestBody PatientTest patientTest){

        patientService.addPatientTest(patientTest);
    }

    @DeleteMapping(value="patient/deletePatientInformation/{patientId}")
    public void deletePatientInformation(@PathVariable int patientId) {
       patientService.deletePatientInformation(patientId);
    }

    @DeleteMapping(value="patient/deletePatientExamination/{peId}")
    public void deletePatientExamination(@PathVariable int peId) {
        patientService.deletePatientExamination(peId);
    }

    @DeleteMapping(value="patient/deletePatientTreatment/{ptId}")
    public void deletePatientTreatment(@PathVariable int ptId) {
        patientService.deletePatientTreatment(ptId);
    }

    @DeleteMapping(value="patient/deletePatientMedicines/{pmId}")
    public void deletePatientMedicines(@PathVariable int pmId) {
        patientService.deletePatientMedicines(pmId);
    }

    @DeleteMapping(value="patient/deletePatientTest/{pTestId}")
    public void deletePatientTest(@PathVariable int pTestId) {
        patientService.deletePatientTest(pTestId);
    }

    @PutMapping(value="patient/updatePatientInformation")
    public void updatePatientInformation(@RequestBody PatientInformation patientInformation) {
        patientService.updatePatientInformation(patientInformation);
    }

    @PutMapping(value="patient/updatePatientExamination")
    public void updatePatientExamination(@RequestBody PatientExamination patientExamination) {
        patientService.updatePatientExamination(patientExamination);
    }

    @PutMapping(value="patient/updatePatientTreatment")
    public void updatePatientTreatment(@RequestBody PatientTreatment patientTreatment) {
        patientService.updatePatientTreatment(patientTreatment);
    }

    @PutMapping(value="patient/updatePatientMedicines")
    public void updatePatientMedicines(@RequestBody PatientMedicines patientMedicines) {
        patientService.updatePatientMedicines(patientMedicines);
    }

    @PutMapping(value="patient/updatePatientTest")
    public void updatePatientTest(@RequestBody PatientTest patientTest) {
        patientService.updatePatientTest(patientTest);
    }

    @GetMapping(value="patient/getPatientInformation/{patientId}")
    public PatientInformation getPatientInformation(@PathVariable int patientId) {
        return patientService.getPatientInformation(patientId);
    }

    @GetMapping(value="patient/getPatientExamination/{peId}")
    public PatientExamination getPatientExamination(@PathVariable int peId) {
        return patientService.getPatientExamination(peId);
    }

    @GetMapping(value = "patient/getPatientByNurse/{nurse_id}")
    public List<PatientInformation> getPatientInformationByNurse(@PathVariable int nurse_id)
    {
    	return patientService.getPatientInformationByNurseId(nurse_id);
    }
    
    @GetMapping(value="patient/getPatientTreatment/{ptId}")
    public PatientTreatment getPatientTreatment(@PathVariable int ptId) {
        return patientService.getPatientTreatment(ptId);
    }

    @GetMapping(value="patient/getPatientMedicines/{pmId}")
    public PatientMedicines getPatientMedicines(@PathVariable int pmId) {
        return patientService.getPatientMedicines(pmId);
    }

    @GetMapping(value="patient/getPatientTest/{pTestId}")
    public PatientTest getPatientTest(@PathVariable int pTestId) {
        return patientService.getPatientTest(pTestId);
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(value="patient/getAllPatientInformation")
    public List<PatientInformation> getAllPatientInformation(){
        return patientService.getAllPatientInformation();
    }

    @GetMapping(value="patient/getAllPatientExamination")
    public List<PatientExamination> getAllPatientExamination(){
        return patientService.getAllPatientExamination();
    }

    @GetMapping(value="patient/getAllPatientTreatment")
    public List<PatientTreatment> getAllPatientTreatment(){
        return patientService.getAllPatientTreatment();
    }

    @GetMapping(value="patient/getAllPatientMedicines")
    public List<PatientMedicines> getAllPatientMedicines(){
        return patientService.getAllPatientMedicines();
    }

    @GetMapping(value="patient/getAllPatientTest")
    public List<PatientTest> getAllPatientTest(){
        return patientService.getAllPatientTest();
    }

    @GetMapping(value="patient/getPatientExaminationByPatientId/{patientId}")
    public List<PatientExamination> getPatientExaminationByPatientId(@PathVariable int patientId){
        return patientService.getAllPatientExaminationByPatientId(patientId);
    }

    @GetMapping(value="patient/getPatientInformationByNurseId/{nurseId}")
    public List<PatientInformation> getPatientInformatioinByNurseId(@PathVariable int nurseId){
        return patientService.getAllPatientInformationByNurseId(nurseId);
    }

    @GetMapping(value="patient/getPatientInformationByDoctorId/{doctorId}")
    public List<PatientInformation> getPatientInformatioinByDoctorId(@PathVariable int doctorId){
        return patientService.getAllPatientInformationByDoctorId(doctorId);
    }

    @GetMapping(value="patient/getPatientTreatmentByPatientId/{patientId}")
    public List<PatientTreatment> getPatientTreatmentByPeId(@PathVariable int patientId){
        return patientService.getAllPatientTreatmentByPatientId(patientId);
    }

    @GetMapping(value="patient/getPatientMedicinesByPtId/{ptId}")
    public List<PatientMedicines> getPatientMedicinesByPtId(@PathVariable int ptId){
        return patientService.getAllPatientMedicinesByPtId(ptId);
    }

    @GetMapping(value="patient/getPatientTestByPtId/{ptId}")
    public List<PatientTest> getPatientTestByPtId(@PathVariable int ptId){
        return patientService.getAllPatientTestByPtId(ptId);
    }


    @GetMapping(value = "patient/getPatientInformationByEmail/{patient_email}")
    public PatientInformation getPatientInformationByEmail(@PathVariable String patient_email)
    {
    	PatientInformation objPatientInformation = patientService.getPatientByEmail(patient_email);
		return objPatientInformation; 
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping(value="patient/getPtIdByPatientId/{patientId}")
    public List<Integer> getPatienTreatIdByPtId(@PathVariable int patientId){
        return patientService.getPtIdbyPatientId(patientId);
    }
    
    @GetMapping(value = "medicines/getAllMedicines")
    public List<Medicines> getAllMedicines()
    {
    	return patientService.getAllMedicines();
    }

    @GetMapping(value = "medicines/getAllMedicinesByType/{medicineType}")
    public List<Medicines> getAllMedicinesByType(@PathVariable String medicineType)
    {
    	return medicinesService.getMedicinesType(medicineType);
    }

@PostMapping(value = "patientTreatment2/addPatintTreatment2")
    public  void addPatientTreament2(@RequestBody PatientTreatment2 patientTreatment2)
    {
    	patientService.addPatientTreatment2(patientTreatment2);
    }

 @DeleteMapping(value = "patientTreatment2/deletePatientTreatment2ById/{pt2Id}")
	public int deletePatientTreatment2(@PathVariable int pt2Id)
	{
		return patientService.deleteMedicineByPt2Id(pt2Id);
	}

 @GetMapping(value = "patientTreatment2/getPatientTreatment2ById/{patientId}")
 public List<PatientTreatment2> GetAllPatientTreatment2ById(@PathVariable int patientId)
 {
	 return patientService.getAllPatientTreatment2ByPatientId(patientId);
 }



}
