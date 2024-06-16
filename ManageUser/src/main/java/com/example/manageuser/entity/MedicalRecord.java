package com.example.manageuser.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicalRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String idPatient;
    private String rememberTheIncidentAfterTheFalling ;
    private String alernessAfterFalling;
    private String ecgStatus;
    private String speechRespone;
    private String reasonForHospitalization;
    private String diabetes;
    private String coagulation;
    private String spo2;
    private String kConcentration;
    private String neckStiff;
    private String rotterdamPoint;
    private String protein;
    private String hemoglobin;
    private String medicalHistory;
    private String chestAbdomenLungDamage;
    private String erythrocyte;
    private String ure;
    private String cranialNerveParalysis;
    private String hypertension;
    private String epileptic;
    private String temprature;
    private String  nausea;
    private String timeFromAccidentToHospitalization;
    private String cardiovascularDisease;
    private String brainParenchyma;
    private String transportationMethod;
    private String quadriplegia;
    private String oldBrainStroke;
    private String skull;
    private String  eyeRespone;
    private String headache;
    private String  rightPupillaryReflexToLight;
    private String leftPupillaryReflexToLight;
    private String  bloodPressure;
    private String quantitativeEthanol;
    private String cbc;
    private String pluse;
    private String  glassgow;
    private String electrolyte;
    private String leftPupilSize;
    private String firstAid;
    private String alb;
    private String leukocyte;
    private String clConcentration;
    private String pt;
    private String reason;
    private String riskOfBrainInjury;
    private String gpt;
    private String naConcentration;
    private String got;
    private String ctImage;
    private String otherChronicDiseases;
    private String inputTime;
    private String rightPupilSize;
    private String breathing;
    private String aptt;
    private String technique;
    private String movementRespond;
    private String  creatinin;
    private String  platelet;
    


    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @PrePersist
    protected void onCreate() {
        createTime = new Date();
    }

}
