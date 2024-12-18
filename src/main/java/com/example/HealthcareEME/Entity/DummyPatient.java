package com.example.HealthcareEME.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class DummyPatient {

	private String fname;
	private String lname;
	private String contact;
	private Doctor doc;
	
}
