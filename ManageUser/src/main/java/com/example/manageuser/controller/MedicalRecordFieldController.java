package com.example.manageuser.controller;

import com.example.manageuser.dto.MedicalRecordFieldRequest;
import com.example.manageuser.entity.MedicalRecordFields;
import com.example.manageuser.service.MedicalRecordFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicalRecordFieldController {
    @Autowired
    MedicalRecordFieldService service;

    @PostMapping("/medical_record_field")
    public MedicalRecordFields createClinicalField(@RequestBody MedicalRecordFieldRequest request){
        if(service.isNameFieldExits(request.getNameField())){
            return null;
        }
        return service.createFiled(request);
    }

    @GetMapping("/medical_record_fields")
    public List<MedicalRecordFields> getAllField(){
        return service.getAllField();
    }
}
