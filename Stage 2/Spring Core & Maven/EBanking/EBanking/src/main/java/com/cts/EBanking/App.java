package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// Please start your code from here
		// Configuration and Input data read here
		// Refer sample input details
		try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");){
			SmartBankAccount sba = (SmartBankAccount) ctx.getBean("smartBankAccount");
			System.out.println("Welcome Mr/Ms: " + sba.getName());
			System.out.println("Your customer id is :" + sba.getBalance());
			System.out.println("Please select account type\r\n" + "1 CurrentAccount\r\n" + "2 RecurringAccount\r\n"
					+ "3 FixedAccount\r\n");
			Scanner scanner = new Scanner(System.in);
			DecimalFormat dc = new DecimalFormat(".00");
			switch (scanner.nextInt()) {
	
			case 1:
				System.out.println("Select transaction type \n 1.Deposit \n 2.Withdraw");
				int choice = scanner.nextInt();
				if (choice == 1) {
					// Do call deposit
					System.out.println("Enter amount to be deposited");
					double amount1 = scanner.nextDouble();
					System.out.println("Your balance amount is " + dc.format(sba.doDeposit(amount1)));
				} else if (choice == 2) {
					// Do call Withdraw
					System.out.println("Enter amount to be withdrawn");
					double amount2 = scanner.nextDouble();
					System.out.println("Your balance amount is " + dc.format(sba.doWithdraw(amount2)));
				} else {
					System.out.println("Wrong choice");
				}
				break;
			case 2:
				// Code for recurringAccount
				System.out.println("Enter monthly installment");
				double amount3 = scanner.nextDouble();
				System.out.println("Enter tenure in months");
				int months = scanner.nextInt();
				System.out.println("Your balance after " + months + " months will be "
						+ sba.calculateRecurringAccount(amount3, months));
				break;
			case 3:
				// Code for FD
				System.out.println("Enter FD amount");
				double amount4 = scanner.nextDouble();
				System.out.println("Enter tenure in months");
				int months1 = scanner.nextInt();
				System.out.println(
						"Your balance after " + months1 + " months will be " + sba.calculateFixedAccount(amount4, months1));
				break;
	
			default:
				System.out.println("Wrong Choice");
	
			}
			scanner.close();
		}
	}
}
