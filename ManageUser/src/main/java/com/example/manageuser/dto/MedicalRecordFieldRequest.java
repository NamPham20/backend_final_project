package com.example.manageuser.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicalRecordFieldRequest {
    private String nameField;
    private String Type;
    private String valueType;
    private String valueList;
    private String diagnoseType;
    private String nameInDataBase;
}
