package com.example.manageuser.mapper;

import com.example.manageuser.dto.InformationPatientCreationRequest;
import com.example.manageuser.entity.InformationPatient;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface InformationPatientMapper {

    public InformationPatient toInformationPatient(InformationPatientCreationRequest request);
}
