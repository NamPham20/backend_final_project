package com.example.manageuser.respository;

import com.example.manageuser.entity.MedicalRecord;
import com.example.manageuser.entity.MedicalRecordFields;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicalRecordRepository extends JpaRepository<MedicalRecord,String> {
    public List<MedicalRecord> findMedicalRecordByIdPatient(String idPatient);
    public List<MedicalRecord> findAllByOrderByCreateTimeAsc() ;
}
