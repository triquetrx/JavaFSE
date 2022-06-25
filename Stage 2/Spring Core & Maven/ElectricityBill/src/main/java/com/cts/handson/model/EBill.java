package com.cts.handson.model;

import java.util.Date;
import com.cts.handson.util.DateUtil;

public class EBill {
	private long billNumber;
	private String consumerId;
	private Date billingMonth;	
	private long reading;
	private long unit;
	private double amount;
	public EBill(String consumerId, Date month, long reading, long unit, double amount) {
		super();
		this.consumerId = consumerId;
		this.billingMonth = month;
		this.reading = reading;
		this.unit = unit;
		this.amount = amount;
	}
	public EBill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(long billNumber) {
		this.billNumber = billNumber;
	}
	public String getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	public Date getBillingMonth() {
		return billingMonth;
	}
	public void setBillingMonth(Date billingMonth) {
		this.billingMonth = billingMonth;
	}
	public long getReading() {
		return reading;
	}
	public void setReading(long reading) {
		this.reading = reading;
	}
	public long getUnit() {
		return unit;
	}
	public void setUnit(long unit) {
		this.unit = unit;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return String.format("%-5s %-15s %-10s %10s %5s %.2f", billNumber,consumerId,DateUtil.dateToString(billingMonth),reading,unit,amount);
	}
}
