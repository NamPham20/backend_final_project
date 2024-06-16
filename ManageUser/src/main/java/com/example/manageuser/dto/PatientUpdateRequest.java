package com.example.manageuser.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PatientUpdateRequest {
    private String fullName;
    private String department;
    private String hospitalizedDay;
    private String hospitalizedYear;
    private String gender;
    private String age;
    private String address;
    private String phoneNumber;
    private String healthInsuranceCode;
    private String inputStatus;
}
