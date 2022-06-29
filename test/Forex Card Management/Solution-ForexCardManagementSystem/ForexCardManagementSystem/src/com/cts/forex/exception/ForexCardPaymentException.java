package com.cts.forex.exception;

public class ForexCardPaymentException extends Exception{
	
	String strMsg1;
	Throwable strMsg2;

	public ForexCardPaymentException() {
		super();
	}

	public ForexCardPaymentException(String strMsg1, Throwable strMsg2) {
		super();
		this.strMsg1 = strMsg1;
		this.strMsg2 = strMsg2;
	}

}
