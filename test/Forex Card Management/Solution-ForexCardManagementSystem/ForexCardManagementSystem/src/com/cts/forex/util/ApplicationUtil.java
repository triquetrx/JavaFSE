package com.cts.forex.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cts.forex.exception.ForexCardPaymentException;

public class ApplicationUtil {

	public static List<String> readFile(String inputfeed) throws ForexCardPaymentException {
		List<String> creditCardPytList = new ArrayList<String>();

		// FILL THE CODE HERE
		Scanner myReader = null;
		try {
			File myObj = new File(inputfeed);
			myReader = new Scanner(myObj);

			while (myReader.hasNextLine()) {
				String line = myReader.nextLine();
				String inputLine[] = line.split(",");
				try {
					if (checkIfDateOfPytIsLessThanDueDate(ApplicationUtil.stringToDateConverter(inputLine[7]),
							ApplicationUtil.stringToDateConverter(inputLine[6]))) {
						creditCardPytList.add(line);
					}
				} catch (NumberFormatException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			myReader.close();
		}

		return creditCardPytList;
	}

	public static java.sql.Date utilToSqlDateConverter(java.util.Date utDate) {
		return (java.sql.Date)utDate;
	}

	public static java.util.Date stringToDateConverter(String stringDate) {
		// TYPE YOUR CODE HERE
		SimpleDateFormat frmt = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = frmt.parse(stringDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;

	}

	public static boolean checkIfDateOfPytIsLessThanDueDate(Date dateOfPyt, Date dueDate) {
		boolean eligibility = false;
		if (dueDate.after(dateOfPyt)) {
			eligibility = true;
		}
		return eligibility;
	}
}
