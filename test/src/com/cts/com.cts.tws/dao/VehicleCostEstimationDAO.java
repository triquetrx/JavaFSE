package com.cts.tws.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import com.cts.tws.exception.VehicleCostEstimationException;
import com.cts.tws.model.TwoWheelerSpecification;
import java.sql.Connection;
import java.sql.PreparedStatement;
public class VehicleCostEstimationDAO {
    public static Connection connection = null;
    public boolean insertVehicleDetails(
            ArrayList <TwoWheelerSpecification> costEstimation) throws VehicleCostEstimationException, SQLException {
        boolean recordsAdded = false;
        Connection con=null;
        try {
            int status[];
            DBConnectionManager dbManager = DBConnectionManager.getInstance();
            con = dbManager.getConnection();
            PreparedStatement pstmt = null;
            String sql = "INSERT INTO VehicleCostEstimation('twoWheelerType','modelNumber','engineType','frontBreak','rea rBreak','mileage','maxPower','fuelCapacity','displacement','numberOfCylinders','vehicl eCost') VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            for (TwoWheelerSpecification student : costEstimation) {
                pstmt.setString(1, student.getTwoWheelerType());
                pstmt.setString(2, student.getModelNumber());
                pstmt.setString(3, student.getEngineType());
                pstmt.setString(4, student.getFrontBreak());
                pstmt.setString(5, student.getRearBreak());
                pstmt.setDouble(6, student.getMileage());
                pstmt.setDouble(7, student.getMaxPower());
                pstmt.setDouble(8, student.getFuelCapacity());
                pstmt.setInt(9, student.getDisplacement());
                pstmt.setInt(10, student.getNumberOfCylinders());
                pstmt.setDouble(11, student.getVehicleCost());
                pstmt.addBatch();
                System.out.println("connection added");
            }
            status=pstmt.executeBatch();
            recordsAdded=true;
            for(int s:status){
                if(s<0){
                    recordsAdded=false;
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        finally {
            if(con!=null) {
                try{
                    con.close();
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }

        }
        return recordsAdded;

    }
}