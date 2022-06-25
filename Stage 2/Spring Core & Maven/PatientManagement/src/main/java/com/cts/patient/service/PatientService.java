package com.cts.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.patient.model.Patient;

@Component
public class PatientService {

	// fill the code
	@Autowired
	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void getPatientDetails() {
		System.out.println("Patient Id : " + patient.getPid() + "\n" + "Patient Name : " + patient.getPname() + "\r\n"
				+ "Disease : " + patient.getDisease() + "\r\n" + "Sex : " + patient.getSex() + "\r\n"
				+ "Admit Status : " + patient.getAdmit_status() + "\r\n" + "Age : " + patient.getAge());
	}

}
