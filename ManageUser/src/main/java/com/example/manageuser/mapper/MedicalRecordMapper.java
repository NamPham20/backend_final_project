package com.example.manageuser.mapper;

import com.example.manageuser.dto.MedicalRecordRequest;
import com.example.manageuser.entity.MedicalRecord;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MedicalRecordMapper {
    public MedicalRecord toMedicalRecord (MedicalRecordRequest request);
}
