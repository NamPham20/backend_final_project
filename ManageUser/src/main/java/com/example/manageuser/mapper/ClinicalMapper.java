package com.example.manageuser.mapper;

import com.example.manageuser.dto.MedicalRecordFieldRequest;
import com.example.manageuser.entity.MedicalRecordFields;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClinicalMapper {
    public MedicalRecordFields toClinicalField (MedicalRecordFieldRequest request);
}
