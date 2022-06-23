package com.cts.eezee;

import java.text.ParseException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.eezee.model.Booking;

import com.cts.eezee.service.TransportService;

public class Main {

	public static void main(String[] args) throws ParseException {
	
	// code here
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
		TransportService ts = (TransportService) ctx.getBean("transportService");
		Booking bk = (Booking) ctx.getBean("booking");
		ts.registerBooking(bk);
		ctx.close();
	}	

}
