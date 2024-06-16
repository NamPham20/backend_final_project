package com.example.manageuser.service;

import com.example.manageuser.dto.PatientCreationRequest;
import com.example.manageuser.dto.PatientUpdateRequest;
import com.example.manageuser.entity.Patient;
import com.example.manageuser.mapper.PatientMapper;
import com.example.manageuser.respository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.List;

@Service
public class PatientService {
    @Autowired
    private PatientRepository repository;
    @Autowired
    private PatientMapper patientMapper;

    public Patient createPatient(PatientCreationRequest request){
        Patient patient = new Patient();
        patient = patientMapper.toPatient(request);

        if(hasNullFields(request)){
            patient.setInputStatus("unfinished");
        }
        else {
            patient.setInputStatus("finished");
        }


        return repository.save(patient);
    }

    public Patient updatePatient (String id, PatientUpdateRequest request){
        Patient patient = getPatientById(id);
        patient = patientMapper.toPatient(request);
        return repository.save(patient);
    }
    public boolean isPatientExists(String hospitalizedDay) {
        return repository.findByHospitalizedDay(hospitalizedDay) != null;
    }

    public List<Patient> getAllPatients(){
        return repository.findAllByOrderByCreateTime();
    }

    public List<Patient> getPatientByHealthInsuranceCode(String code){
        return repository.findByHealthInsuranceCode(code);
    }

    public Patient getPatientById(String id){
        return repository.findById(id).orElseThrow(()-> new RuntimeException("User not found")) ;
    }

    public void deleteUser(String id){
        repository.deleteById(id);
    }


    public  boolean hasNullFields(PatientCreationRequest request) {
        if (request == null) {
            return true;
        }
        for (Field field : request.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                try {
                    Object value = field.get(request);
                    if (value == null) {
                        return true;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
        }
        return false;

    }
}
