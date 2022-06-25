package com.spring.app;

import java.util.Calendar;
import java.util.Date;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;


@Configuration
@ComponentScan
public class ApplicationConfig {

	@Bean
	public Employee employee() {
		Employee employee = new Employee();
		employee.setEmpId(123);
		employee.setEmpName("Zaid");
		return employee;
	}

	@Bean
	public Passport passObj() {

		Passport passport = new Passport();

		Date todayDate = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(todayDate);
		cal.add(Calendar.DATE, 84);

		Date expiryDate = cal.getTime();
		passport.setPassNum(1234);
		passport.setDateOfIssue(todayDate);
		passport.setDateOfExpiry(expiryDate);

		return passport;
	}

}