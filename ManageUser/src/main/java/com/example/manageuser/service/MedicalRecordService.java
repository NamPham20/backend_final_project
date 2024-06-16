package com.example.manageuser.service;


import com.example.manageuser.dto.MedicalRecordRequest;
import com.example.manageuser.entity.MedicalRecord;
import com.example.manageuser.mapper.MedicalRecordMapper;
import com.example.manageuser.respository.MedicalRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalRecordService {
    @Autowired
    MedicalRecordRepository repository ;
    @Autowired
    MedicalRecordMapper mapper ;

   public MedicalRecord createMedicalRecord(MedicalRecordRequest request){
        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord = mapper.toMedicalRecord(request);
        return repository.save(medicalRecord);
    }

   public List<MedicalRecord> getAllRecord (){
        return repository.findAllByOrderByCreateTimeAsc();
    }

    public List<MedicalRecord> getRecordByIdPatient(String idPatient){
       return repository.findMedicalRecordByIdPatient(idPatient);
    }

}
