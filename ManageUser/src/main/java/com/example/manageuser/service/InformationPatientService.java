package com.example.manageuser.service;

import com.example.manageuser.dto.InformationPatientCreationRequest;
import com.example.manageuser.entity.InformationPatient;
import com.example.manageuser.mapper.InformationPatientMapper;
import com.example.manageuser.respository.InformationPatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationPatientService {
    @Autowired
    InformationPatientRepository repository;
    @Autowired
    InformationPatientMapper mapper;

    public InformationPatient createInformationField(InformationPatientCreationRequest request){
        InformationPatient informationPatient = new InformationPatient();
        informationPatient = mapper.toInformationPatient(request);
        return repository.save(informationPatient);
    }

    public Boolean isNameFieldExits(String nameField){
        return repository.findByNameField(nameField)!=null;
    }

    public List<InformationPatient> getAllField(){
        return repository.findAllByOrderByCreateTimeAsc();
    }

}
