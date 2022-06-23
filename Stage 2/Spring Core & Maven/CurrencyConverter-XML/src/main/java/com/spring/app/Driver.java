package com.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
@SuppressWarnings("resource")
public static void main(String[] args)
{
	CurrencyConverter cc = (CurrencyConverter) new ClassPathXmlApplicationContext("beans.xml").getBean("currencyConverter");
}

}
