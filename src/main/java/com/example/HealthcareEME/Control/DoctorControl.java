package com.example.HealthcareEME.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.HealthcareEME.Entity.Doctor;
import com.example.HealthcareEME.Service.DoctorService;



@RestController
public class DoctorControl {

	@Autowired
	DoctorService dservice;
	
	@GetMapping("/getDoctors")
	public List<Doctor> getAll()
	{
		return dservice.getDoctors();
	}
}
