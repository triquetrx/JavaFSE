package com.cts.EBanking;

import java.util.List;

public abstract class BankAccount {

	private int customerId;
	private String name;
	private double balance;
	private List<String> accounts;

	// Write your code here
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<String> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<String> accounts) {
		this.accounts = accounts;
	}

	public double doDeposit(double amount) {
		this.balance += amount;
		return balance;
	}

	public double doWithdraw(double amount) {
		if (balance > amount) {
			this.balance -= amount;
			return balance;
		}
		return -1;
	}

	public abstract double calculateFixedAccount(double amount, int months);

	public abstract double calculateRecurringAccount(double amount, int months);

}
