package com.app.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.DBConfig;
import com.spring.app.EmployeeDAO;

public class Main {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
 
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDAO emp = (EmployeeDAO) ctx.getBean("employeeDAO");
		
		DBConfig dbConfig = emp.getDbConfig();
		System.out.println(dbConfig.getDriverName());
		System.out.println(dbConfig.getUrl());
		System.out.println(dbConfig.getUserName());
		System.out.println(dbConfig.getPassword());
 
		
	}
}