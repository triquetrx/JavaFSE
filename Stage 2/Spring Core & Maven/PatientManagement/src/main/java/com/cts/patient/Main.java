package com.cts.patient;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.patient.service.PatientService;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// fill the code
		PatientService ps = (PatientService) new AnnotationConfigApplicationContext(
				com.cts.patient.config.AppConfig.class).getBean(PatientService.class);
		ps.getPatientDetails();
	}

}
