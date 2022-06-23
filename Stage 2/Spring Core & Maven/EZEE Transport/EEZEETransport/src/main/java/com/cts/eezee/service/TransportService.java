package com.cts.eezee.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map.Entry;

import com.cts.eezee.model.Booking;
import com.cts.eezee.model.Vehicle;

public class TransportService {
	@Autowired
	private Vehicle vehicle;
	private SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void registerBooking(Booking booking) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		// code here
		System.out.println("Enter the Customer Name");
		String name = sc.nextLine();
		System.out.println("Enter the Mobile Number");
		long phno = sc.nextLong();
		System.out.println("Enter the Destination");
		String destination = sc.next();
		System.out.println("Enter the Date of Jouney <dd-MM-yyy>");
		Date dateOfJourney = date.parse(sc.next());
		sc.close();
		
		calculateTravelCost(vehicle.getSource(),destination,dateOfJourney);
	}
	public void calculateTravelCost(String source, String destination, Date doj) {

		// code here
		String res = checkAvailableDateForTravel(doj)?"Total Travel Cost is Rs. "+getCost(destination):"Invalid Travel Date";
		System.out.println(res);
	
	}
	
	public boolean checkAvailableDateForTravel(Date doj) {
		
		
		// code here
		Date today = new Date();
		String todayDate = date.format(today);
		String dojString = date.format(doj);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		cal.add(Calendar.DATE, 1);
		
		Date tomorrow = cal.getTime();
		String tomorrowString = date.format(tomorrow);
		
		return dojString.equals(todayDate) || dojString.equals(tomorrowString);
		
		
	}
	
	public double getCost(String destination) {
		
		// code here
		Map<String,Double> destinationMap= vehicle.getDestinationMap();		
		
		
		return destinationMap.containsKey(destination)?destinationMap.get(destination):0.0;
	}


}
