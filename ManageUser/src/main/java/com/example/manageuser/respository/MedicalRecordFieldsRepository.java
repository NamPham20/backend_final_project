package com.example.manageuser.respository;

import com.example.manageuser.entity.MedicalRecordFields;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalRecordFieldsRepository extends JpaRepository<MedicalRecordFields , String> {
    public List<MedicalRecordFields> findAllByOrderByCreateTimeAsc();
    public MedicalRecordFields findByNameField(String nameFiled);
}
