package com.cts.EBanking;

import java.text.DecimalFormat;
import java.util.List;

public class SmartBankAccount extends BankAccount {

	DecimalFormat df = new DecimalFormat(".00");

	public SmartBankAccount(int customerId, String name, double balance, List<String> accounts) {
		super.setAccounts(accounts);
		super.setBalance(balance);
		super.setCustomerId(customerId);
		super.setName(name);
	}

	@Override
	public double calculateFixedAccount(double amount, int months) {
		if (amount > 9999 && amount < 1000001 && months > 0 && months < 121) {
			double totalAmount = amount * Math.pow((1 + (0.1 / 12)), months);
			return Double.parseDouble(df.format(totalAmount));
		}
		return -1;
	}

	@Override
	public double calculateRecurringAccount(double amount, int months) {
		if (amount > 999 && amount < 50001 && months < 61 && months > 0) {
			double totalAmount = (amount * months) + (amount * (months * (months + 1) / 24.0) * (0.07));
			return Double.parseDouble(df.format(totalAmount));
		}
		return -1;
	}
}
