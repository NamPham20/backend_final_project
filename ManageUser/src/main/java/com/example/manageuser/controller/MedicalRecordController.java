package com.example.manageuser.controller;

import com.example.manageuser.dto.MedicalRecordRequest;
import com.example.manageuser.entity.MedicalRecord;
import com.example.manageuser.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MedicalRecordController {
    @Autowired
    MedicalRecordService service;

    @PostMapping("/medical_record")
    public MedicalRecord createClinicalField(@RequestBody MedicalRecordRequest request){
        return service.createMedicalRecord(request);
    }

    @GetMapping("/medical_records")
    public List<MedicalRecord> getAllRecord(){
        return service.getAllRecord();
    }
    @GetMapping("/medical_records/{idPatient}")
    public List<MedicalRecord> getRecordByIdPatient(@PathVariable("idPatient")String idPatient){
        return service.getRecordByIdPatient(idPatient);

    }
}
