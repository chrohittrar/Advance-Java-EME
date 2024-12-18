package com.example.HealthcareEME.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.HealthcareEME.Entity.Patient;


@Repository
public interface PatientRepositry  extends JpaRepository<Patient, Integer> {
	
	@Modifying
	@Query("update Patient set Contact= :contact where pid= :p_id")
	public int updatename(int p_id,String contact);

}
