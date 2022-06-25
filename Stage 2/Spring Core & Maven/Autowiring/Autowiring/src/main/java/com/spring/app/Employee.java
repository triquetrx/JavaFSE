package com.spring.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Employee 
{
    @Value("123")
	private int empId;
	@Value("Zaid Khan")
	private String empName;
	@Autowired
	private Passport passObj;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Passport getPassObj() {
		return passObj;
	}
	public void setPassObj(Passport passObj) {
		this.passObj = passObj;
	}
}
	 	  	    	    	     	      	 	
