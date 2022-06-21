package com.cts.mkm.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.cts.mkm.exception.MkmOrderException;
import com.cts.mkm.vo.MkmOrder;
import com.cts.mkm.util.*;
public class MkmOrderDAO {
    public boolean addMkmOrderDetails(List<MkmOrder> prdOrders) throws
            MkmOrderException {
        boolean recordsAdded = false;
// Fill the code
// TYPE YOUR CODE HERE
        Connection con=null;
        try {
            int[] status;
            con = DBConnectionManager.getInstance().getConnection();
            PreparedStatement pstmt = null;
            String sql = "INSERT INTO MKM_DRESS_COLLECTION VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            for (MkmOrder student : prdOrders) {
                pstmt.setString(1, student.getOrderId());
                pstmt.setString(2, student.getDressCode());
                pstmt.setDate(3, (java.sql.Date) student.getDateOfOrder());
                pstmt.setString(4, student.getDressQuality());
                pstmt.setDate(5, (java.sql.Date) student.getDateOfDelivery());
                pstmt.setInt(6, student.getNoOfDresses());
                pstmt.setString(7, student.getLocation());
                pstmt.setString(8, student.getManagerApproval());
                pstmt.setDouble(9, student.getDressCost());
                pstmt.setDouble(10, student.getGstTax());
                pstmt.setDouble(11, student.getDeliveryCost());
                pstmt.setDouble(12, student.getTotalDressCost());
                pstmt.setString(13, student.getFinalStatusOfOrder());
                pstmt.addBatch();
                System.out.println("Connection Added");
            }
            status=pstmt.executeBatch();
            recordsAdded=true;
            for(int s:status){
                if(s<0){
                    recordsAdded=false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(con!=null) {
                try{
                    con.close();
                } catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        } return recordsAdded;
    }
    public List<MkmOrder> getAllMkmOrderDetails() throws MkmOrderException {
        List<MkmOrder> prdOrders = new ArrayList<MkmOrder>();
        String sql = "SELECT * FROM MKM_DRESS_COLLECTION;";
        Connection connection = DBConnectionManager.getInstance().getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                prdOrders.add(new MkmOrder(resultSet.getString(1),resultSet.getString(2),
                        resultSet.getDate(3),resultSet.getString(4), resultSet.getDate(5),
                        resultSet.getInt(6),resultSet.getString(7),resultSet.getString(8),
                        resultSet.getDouble(9),resultSet.getDouble(10),resultSet.getDouble(11),
                        resultSet.getDouble(12),resultSet.getString(13)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prdOrders;
    }
}
