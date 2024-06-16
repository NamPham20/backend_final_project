package com.example.manageuser.controller;

import com.example.manageuser.dto.InformationPatientCreationRequest;
import com.example.manageuser.entity.InformationPatient;
import com.example.manageuser.service.InformationPatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InformationPatientController {
    @Autowired
    InformationPatientService service;

    @PostMapping("/information_patient")
    InformationPatient createInformationField(@RequestBody InformationPatientCreationRequest request){
        if (service.isNameFieldExits(request.getNameField())){
            return null;
        }
        return service.createInformationField(request);
    }

    @GetMapping("/information_patient")
    List<InformationPatient> getAllFields(){
        return service.getAllField();
    }

}
