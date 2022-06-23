package com.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
@SuppressWarnings("resource")
public static void main(String[] args)
{
	MemberShip ms = (MemberShip) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("membership");
	System.out.println("Membership Id:"+ms.getMembershipId());
}

}
