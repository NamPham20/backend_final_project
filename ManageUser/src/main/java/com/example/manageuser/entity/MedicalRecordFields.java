package com.example.manageuser.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MedicalRecordFields {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String nameField;
    private String Type;
    private String valueType;
    private String valueList;
    private String diagnoseType;
    private String nameInDataBase;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @PrePersist
    protected void onCreate() {
        createTime = new Date();
    }


}
