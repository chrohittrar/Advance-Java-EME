package com.example.HealthcareEME.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HealthcareEME.Entity.Patient;
import com.example.HealthcareEME.Repo.PatientRepositry;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PatientService {
	
	@Autowired
	PatientRepositry prepo;
	
	public Patient getPatient(int cid)
	{
		return prepo.findById(cid).get();
	}
	
	 public void deletePatient(int pid)
	 {
		 prepo.deleteById(pid);
	 }
	 
	 public void savePatient(Patient p)
	 {
		 prepo.save(p);
	 }
	 
	 public int updateContact(int pid,String contact)
		{
			return prepo.updatename(pid, contact);
		}

}
