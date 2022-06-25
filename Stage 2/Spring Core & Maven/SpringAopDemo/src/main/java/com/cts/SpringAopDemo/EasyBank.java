package com.cts.SpringAopDemo;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Type your code here
@Component
public class EasyBank {

	@Value("6789")
	private int pinCode;
	@Value("10000")
	private int balance;
	private int tempPin;

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTempPin() {
		return tempPin;
	}

	public void setTempPin(int tempPin) {
		this.tempPin = tempPin;
	}

	public void doDeposit(int amount) {
		// Type your code here
		this.balance += amount;
		// You have to use double spaces :(
		System.out.println("Your  balance is " + balance);
	}

	public void doWithdraw(int amount) {
		// Type your code here
		if (amount < balance) {
			this.balance -= amount;
			System.out.println("You have successfully withdrawn " + amount);
			return;
		}
		System.out.println("Insufficient Fund");
	}

	public void doChangePin(int oldPin, int pin) {
		// Type your code here
		if (oldPin == pinCode) {
			pinCode = pin;
			return;
		}
		throw new RuntimeErrorException(null, "Pin doesn't match");
	}

	public void showBalance() {
		// Type your code here
		System.out.println("Your balance is " + balance);
	}

}
