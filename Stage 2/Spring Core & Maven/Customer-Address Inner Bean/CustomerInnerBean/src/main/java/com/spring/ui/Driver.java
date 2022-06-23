package com.spring.ui;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.Address;
import com.spring.app.AddressBook;

public class Driver {

	@SuppressWarnings("resource")
	public static AddressBook loadAddressBook() {
		return (AddressBook) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("adb");
	}

	public static void main(String[] args) {
		// invoke the loadAddressBook() method from main retrieve the AddressBook
		// object, get the details from the user set the values and display the values
		System.out.println("Enter the temporary address\n" + "\n" + "Enter the house name");
		Scanner sc = new Scanner(System.in);
		String houseName = sc.nextLine();
		System.out.println("Enter the street");
		String streetName = sc.nextLine();
		System.out.println("Enter the city");
		String city = sc.nextLine();
		System.out.println("Enter the state");
		String state = sc.nextLine();
		System.out.println("Enter the phone number");
		String phno = sc.nextLine();
		
		AddressBook adb = loadAddressBook();
		adb.setPhoneNumber(phno);
		adb.getTempAddress().setCity(city);
		adb.getTempAddress().setHouseName(houseName);
		adb.getTempAddress().setState(state);
		adb.getTempAddress().setStreet(streetName);
		
		System.out.println("Temporary address");
		System.out.println("House name:"+adb.getTempAddress().getHouseName());
		System.out.println("Street:"+adb.getTempAddress().getStreet());
		System.out.println("City:"+adb.getTempAddress().getCity());
		System.out.println("State:"+adb.getTempAddress().getState());
		System.out.println("Phone number :"+adb.getPhoneNumber());		
	}

}
