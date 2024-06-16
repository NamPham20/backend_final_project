package com.example.manageuser.respository;

import com.example.manageuser.dto.PatientCreationRequest;
import com.example.manageuser.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,String> {
    List<Patient> findByHealthInsuranceCode(String healthInsuranceCode);
    @Query("SELECT p FROM Patient p ORDER BY p.createTime DESC")
    List<Patient> findAllByOrderByCreateTime();

    Patient findByHospitalizedDay(String hospitalizedDay);


}
