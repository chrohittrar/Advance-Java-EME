package com.example.HealthcareEME.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HealthcareEME.Entity.Doctor;
import com.example.HealthcareEME.Repo.DoctorRepositry;

@Service
public class DoctorService {

	
	@Autowired
	DoctorRepositry drepo;
	
	public List<Doctor> getDoctors()
	{
		return drepo.findAll();
	}
}
