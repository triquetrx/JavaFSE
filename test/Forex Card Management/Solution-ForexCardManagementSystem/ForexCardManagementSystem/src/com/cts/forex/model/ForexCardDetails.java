package com.cts.forex.model;

import java.util.Date;

public class ForexCardDetails {
	
	private String forexCardNo;
	private String forexCardId;
	private String customerId;
	private String customerName;
	private String forexCardType;
	private double payableAmount;
	private Date dueDate;
	private Date actualPaymentDate;
	private double revisedpayableAmount;
	private double forexCardLimit;
	public ForexCardDetails() {
		
	}
	public ForexCardDetails(String forexCardNo, String forexCardId, String customerId, String customerName,
			String forexCardType, double payableAmount, Date dueDate, Date actualPaymentDate,
			double revisedpayableAmount, double forexCardLimit) {
		super();
		this.forexCardNo = forexCardNo;
		this.forexCardId = forexCardId;
		this.customerId = customerId;
		this.customerName = customerName;
		this.forexCardType = forexCardType;
		this.payableAmount = payableAmount;
		this.dueDate = dueDate;
		this.actualPaymentDate = actualPaymentDate;
		this.revisedpayableAmount = revisedpayableAmount;
		this.forexCardLimit = forexCardLimit;
	}
	public String getForexCardNo() {
		return forexCardNo;
	}
	public void setForexCardNo(String forexCardNo) {
		this.forexCardNo = forexCardNo;
	}
	public String getForexCardId() {
		return forexCardId;
	}
	public void setForexCardId(String forexCardId) {
		this.forexCardId = forexCardId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getForexCardType() {
		return forexCardType;
	}
	public void setForexCardType(String forexCardType) {
		this.forexCardType = forexCardType;
	}
	public double getPayableAmount() {
		return payableAmount;
	}
	public void setPayableAmount(double payableAmount) {
		this.payableAmount = payableAmount;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Date getActualPaymentDate() {
		return actualPaymentDate;
	}
	public void setActualPaymentDate(Date actualPaymentDate) {
		this.actualPaymentDate = actualPaymentDate;
	}
	public double getRevisedpayableAmount() {
		return revisedpayableAmount;
	}
	public void setRevisedpayableAmount(double revisedpayableAmount) {
		this.revisedpayableAmount = revisedpayableAmount;
	}
	public double getForexCardLimit() {
		return forexCardLimit;
	}
	public void setForexCardLimit(double forexCardLimit) {
		this.forexCardLimit = forexCardLimit;
	}
	@Override
	public String toString() {
		return "ForexCardDetails [forexCardNo=" + forexCardNo + ", forexCardId=" + forexCardId + ", customerId="
				+ customerId + ", customerName=" + customerName + ", forexCardType=" + forexCardType
				+ ", payableAmount=" + payableAmount + ", dueDate=" + dueDate + ", actualPaymentDate="
				+ actualPaymentDate + ", revisedpayableAmount=" + revisedpayableAmount + ", forexCardLimit="
				+ forexCardLimit + "]";
	}
	
}
