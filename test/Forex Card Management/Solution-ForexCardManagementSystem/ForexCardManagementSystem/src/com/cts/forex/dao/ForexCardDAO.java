package com.cts.forex.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.cts.forex.exception.ForexCardPaymentException;
import com.cts.forex.model.ForexCardDetails;
import com.cts.forex.util.ApplicationUtil;

public class ForexCardDAO {
	public static Connection connection = null;

	public boolean insertForexCardPyt(ArrayList <ForexCardDetails> forexCardPyts) throws ForexCardPaymentException {
		boolean recordsAdded = false;
		Connection con=null;
		try {
			int status[];
			DBConnectionManager dbManager = DBConnectionManager.getInstance();
			con = dbManager.getConnection();
			PreparedStatement pstmt = null;
			pstmt = con.prepareStatement("INSERT INTO ForexCardPayment VALUES(?,?,?,?,?,?,?,?,?)");

			for (ForexCardDetails student : forexCardPyts) {
				pstmt.setString(1, student.getForexCardNo());
				pstmt.setString(2, student.getForexCardId());
				pstmt.setString(3, student.getCustomerId());
				pstmt.setString(4, student.getCustomerName());
				pstmt.setString(5, student.getForexCardType());
				pstmt.setDouble(6, student.getPayableAmount());
				pstmt.setDate(7, (java.sql.Date) student.getDueDate());
				pstmt.setDate(8, (java.sql.Date) student.getActualPaymentDate());
				pstmt.setDouble(9, student.getRevisedpayableAmount());
				pstmt.setDouble(10, student.getForexCardLimit());
				pstmt.addBatch();
				System.out.println("connectionadded");
			}

			status=pstmt.executeBatch();
			recordsAdded=true;
			for(int s:status){
				if(s<0){
				recordsAdded=false;
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(con!=null) {
				try{
				con.close();
				}
				catch(Exception e)
				{
				
				}
			}
		}
		return recordsAdded;
	}
	
}
