package com.cts.forex.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cts.forex.dao.ForexCardDAO;
import com.cts.forex.exception.ForexCardPaymentException;
import com.cts.forex.model.ForexCardDetails;
import com.cts.forex.util.ApplicationUtil;

public class ForexCardPaymentService {

	ForexCardDAO forexcardDAO = new ForexCardDAO();

	public static ArrayList<ForexCardDetails> buildForexCardPaymentList(List<String> forexCardPytRecords) {

		ArrayList<ForexCardDetails> forexCardPytList = new ArrayList<ForexCardDetails>();

		// TYPE YOUR CODE HERE
		for (String student : forexCardPytRecords) {
			String details[] = student.split(",");
			ForexCardDetails applicant = new ForexCardDetails(details[0],
					details[1],
					details[2],
					details[3],
					details[4],
					Double.parseDouble(details[5]),
					ApplicationUtil.stringToDateConverter(details[6]),
					ApplicationUtil.stringToDateConverter(details[7]),
					calculateDiscountedPayableAmt(details[4], Double.parseDouble(details[9]),
							Double.parseDouble(details[5])),
					Double.parseDouble(details[9]));
			forexCardPytList.add(applicant);
		}

		return forexCardPytList;
	}

	public boolean addForexCardPytDetails(String inputFeed) throws ForexCardPaymentException {

		// TYPE YOUR CODE HERE
		List<String> admissionList = ApplicationUtil.readFile(inputFeed);
		ArrayList<ForexCardDetails> customerPlanPytList = buildForexCardPaymentList(admissionList);
		ForexCardDAO admissionDAO = new ForexCardDAO();
		try {
			admissionDAO.insertForexCardPyt(customerPlanPytList);
			return true;
		} catch (ForexCardPaymentException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static double calculateDiscountedPayableAmt(String forexCardType, double forexCardLimit, double payableAmt) {
		double revisedpayableAmt = 0.0;

		// TYPE YOUR CODE HERE
		if ((forexCardType.equalsIgnoreCase("Multicurrency ForexPlus Card")) && forexCardLimit >= 100000
				&& forexCardLimit <= 250000) {
			revisedpayableAmt = payableAmt - (payableAmt * 0.1);
		} else if ((forexCardType.equalsIgnoreCase("Multicurrency ForexPlus Card")) && forexCardLimit >= 250001
				&& forexCardLimit <= 500000) {
			revisedpayableAmt = payableAmt - (payableAmt * 0.15);
		} else if ((forexCardType.equalsIgnoreCase("Multicurrency ForexPlus Card")) && forexCardLimit > 500000) {
			revisedpayableAmt = payableAmt - (payableAmt * 0.2);
		} else if ((forexCardType.equalsIgnoreCase("ISIC Student ForexPlusCard")) && forexCardLimit >= 50000
				&& forexCardLimit <= 100000) {
			revisedpayableAmt = payableAmt - (payableAmt * 0.15);
		} else if ((forexCardType.equalsIgnoreCase("ISIC Student ForexPlusCard")) && forexCardLimit >= 100001
				&& forexCardLimit <= 500000) {
			revisedpayableAmt = payableAmt - (payableAmt * 0.2);
		} else if ((forexCardType.equalsIgnoreCase("ISIC Student ForexPlusCard")) && forexCardLimit >= 500001
				&& forexCardLimit <= 1000000) {
			revisedpayableAmt = payableAmt - (payableAmt * 0.25);
		} else if ((forexCardType.equalsIgnoreCase("Hajj Umrah Card")) && forexCardLimit >= 10000
				&& forexCardLimit <= 50000) {
			revisedpayableAmt = payableAmt - (payableAmt * 0.2);
		} else if ((forexCardType.equalsIgnoreCase("Hajj Umrah Card")) && forexCardLimit >= 50001
				&& forexCardLimit <= 100000) {
			revisedpayableAmt = payableAmt - (payableAmt * 0.25);
		} else if ((forexCardType.equalsIgnoreCase("Hajj Umrah Card")) && forexCardLimit > 100000) {
			revisedpayableAmt = payableAmt - (payableAmt * 0.3);
		}
		return Math.round(revisedpayableAmt);

	}

}
