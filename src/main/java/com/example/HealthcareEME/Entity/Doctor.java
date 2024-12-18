package com.example.HealthcareEME.Entity;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="doctor")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Doctor {

	@Id
	private Integer doctor_id;
	
	@Column
	private String name;
	
	@Column
	private String degree;
	
	@Column
	private String specialization;
	
	@Column
	private Integer experience; 
	
	@JsonIgnoreProperties("doctor_id")
	@OneToMany(mappedBy = "doctor_id", cascade = CascadeType.ALL)
	List<Patient> patients;
}
