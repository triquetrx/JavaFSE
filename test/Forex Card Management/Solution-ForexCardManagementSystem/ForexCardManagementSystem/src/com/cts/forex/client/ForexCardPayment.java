package com.cts.forex.client;

import com.cts.forex.exception.ForexCardPaymentException;
import com.cts.forex.service.ForexCardPaymentService;
import com.cts.forex.skeleton.SkeletonValidator;

public class ForexCardPayment {

	public static void main(String[] args) throws ForexCardPaymentException {

		// CODE SKELETON - VALIDATION STARTS
		// DO NOT CHANGE THIS CODE

		new SkeletonValidator();

		// CODE SKELETON - VALIDATION ENDS

		// TYPE YOUR CODE HERE
		ForexCardPaymentService forexService = new ForexCardPaymentService();

		forexService.addForexCardPytDetails("inputfeed.txt");

	}

}
