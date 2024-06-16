package com.example.manageuser.mapper;

import com.example.manageuser.dto.PatientCreationRequest;
import com.example.manageuser.dto.PatientUpdateRequest;
import com.example.manageuser.entity.Patient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    public Patient toPatient(PatientCreationRequest request);
    public Patient toPatient(PatientUpdateRequest request);
}
