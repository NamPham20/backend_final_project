package com.example.manageuser.controller;

import com.example.manageuser.dto.PatientCreationRequest;
import com.example.manageuser.dto.PatientUpdateRequest;
import com.example.manageuser.dto.UserCreationRequest;
import com.example.manageuser.dto.UserUpdateRequest;
import com.example.manageuser.entity.Patient;
import com.example.manageuser.entity.User;
import com.example.manageuser.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PatientController {
    @Autowired
    private PatientService patientService;

    @PostMapping("patient/")
    Patient createPatient(@RequestBody PatientCreationRequest request){
        if(patientService.isPatientExists(request.getHealthInsuranceCode())){
            return null;
        }
        return patientService.createPatient(request);
    }
    @GetMapping("/patients")
    List<Patient> getAllPatient(){
        return patientService.getAllPatients();
    }

    @GetMapping("/patients/{healthInsuranceCode}")
    List<Patient> getPatientByHealthCode(@PathVariable("healthInsuranceCode") String healthInsuranceCode){
       return patientService.getPatientByHealthInsuranceCode(healthInsuranceCode);
    }


    @PutMapping("/patient/{id}")
    Patient updateUserById(@PathVariable("id") String id,@RequestBody PatientUpdateRequest request){
        return patientService.updatePatient(id,request);
    }
    @DeleteMapping("patient/{id}")
    void deleteUser(@PathVariable("id") String id){
        patientService.deleteUser(id);
    }
}
