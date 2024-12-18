package com.example.HealthcareEME.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.HealthcareEME.Entity.Doctor;

@Repository
public interface DoctorRepositry extends JpaRepository<Doctor, Integer> {

}
