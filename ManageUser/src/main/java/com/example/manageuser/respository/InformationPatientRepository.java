package com.example.manageuser.respository;

import com.example.manageuser.entity.InformationPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InformationPatientRepository extends JpaRepository<InformationPatient,String> {
    public InformationPatient findByNameField (String nameFile);
    public List<InformationPatient> findAllByOrderByCreateTimeAsc ();
}
