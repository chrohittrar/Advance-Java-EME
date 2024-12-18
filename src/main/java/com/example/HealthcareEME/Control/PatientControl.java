package com.example.HealthcareEME.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.HealthcareEME.Entity.DummyPatient;
import com.example.HealthcareEME.Entity.Patient;
import com.example.HealthcareEME.Service.DoctorService;
import com.example.HealthcareEME.Service.PatientService;


@RestController
public class PatientControl {
	
	@Autowired
	PatientService pservice;
	
	@Autowired
	DoctorService dservice;
	
	@GetMapping("/getPatient")
	public Patient getOne(@RequestParam("pid") int pid)
	{
		return pservice.getPatient(pid);
	}
    @DeleteMapping("/deletepatient")
	public String delete(@RequestParam("pid") int pid )
	{
    	pservice.deletePatient(pid);
	   return "Deleted :)) ";
	}
    
    @PutMapping("/updatecontact/{pid}/{contact}")
	public int updateName(@PathVariable int pid,@PathVariable String contact)
	{
		return pservice.updateContact(pid, contact);
	}
    
    @PostMapping("/savePatient")
   	public String save(@RequestBody DummyPatient p )
   	{
   	   Patient pr=new Patient();
   	   pr.setFname(p.getFname());
   	   pr.setLname(p.getLname());
   	   pr.setContact(p.getContact());
   	   pr.setDoctor_id(p.getDoc());  
   	   pservice.savePatient(pr);
   	   return "Inserted Successfully :))";
   	}
	


	
	

}
