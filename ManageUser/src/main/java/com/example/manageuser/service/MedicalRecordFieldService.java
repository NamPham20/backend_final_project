package com.example.manageuser.service;

import com.example.manageuser.dto.MedicalRecordFieldRequest;
import com.example.manageuser.entity.MedicalRecordFields;
import com.example.manageuser.mapper.ClinicalMapper;
import com.example.manageuser.respository.MedicalRecordFieldsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordFieldService {
    @Autowired
    private MedicalRecordFieldsRepository repository;
    @Autowired
    private ClinicalMapper mapper;

    public MedicalRecordFields createFiled(MedicalRecordFieldRequest request){
        MedicalRecordFields medicalRecordFields = new MedicalRecordFields();
        medicalRecordFields = mapper.toClinicalField(request);
        return repository.save(medicalRecordFields);
    }

    public Boolean isNameFieldExits(String nameField){
        return repository.findByNameField(nameField)!=null;
    }

    public List<MedicalRecordFields> getAllField(){
        return repository.findAllByOrderByCreateTimeAsc()  ;
    }

}
