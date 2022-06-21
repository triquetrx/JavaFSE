package com.cts.tws.service;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.cts.tws.dao.VehicleCostEstimationDAO;
import com.cts.tws.exception.VehicleCostEstimationException;
import com.cts.tws.model.*;
public class VehicleCostEstimationService {
    public static ArrayList<TwoWheelerSpecification> buildVehicleList(List <String> vehicleRecords) {

        ArrayList<TwoWheelerSpecification> motorProjectRecordList = new ArrayList<TwoWheelerSpecification>();
//WRITE YOUR CODE HERE
        for(String student:vehicleRecords) {
            String[] details =student.split(",");
            TwoWheelerSpecification applicant =new TwoWheelerSpecification( details[0],
                    details[1],
                    details[2],
                    details[3],
                    details[4],
                    Double.parseDouble(details[5]) ,
                    Double.parseDouble(details[6]) ,
                    Double.parseDouble(details[7]) ,
                    Integer.parseInt(details[8]) ,
                    Integer.parseInt(details[9]) ,
                    estimateVehicleCost(details[0],Double.parseDouble(details[5]),Double.parseDouble(details[7]) )
            );
            motorProjectRecordList.add(applicant);
            System.out.println(applicant.toString());
        }
        return motorProjectRecordList;
    }
    public boolean addVehicleDetails(String inputFeed) throws VehicleCostEstimationException, SQLException {

        boolean flag=false;
        List<String> admissionList= com.cts.tws.util.ApplicationUtil.readFile(inputFeed);

        ArrayList<TwoWheelerSpecification> customerPlanPytList= buildVehicleList(admissionList);

        VehicleCostEstimationDAO admissionDAO=new VehicleCostEstimationDAO();

        try {
            admissionDAO.insertVehicleDetails(customerPlanPytList);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    public static double estimateVehicleCost(String vehicleType,double mileage,double fuelCapacity)
    {

        double cost = 0;
        if(vehicleType.equalsIgnoreCase("Standard Motorbikes") && mileage>=100 && mileage<=149&&fuelCapacity>=10&&fuelCapacity<=14) {
            cost=65000;
        } else if(vehicleType.equalsIgnoreCase("Standard Motorbikes") && mileage<=60 &&fuelCapacity<=5) {
            cost=45000;
        } else if(vehicleType.equalsIgnoreCase("Standard Motorbikes") && mileage>=61 && mileage<=99&&fuelCapacity>=6&&fuelCapacity<=9) {
            cost=55000;
        } else if(vehicleType.equalsIgnoreCase("Standard Motorbikes") && mileage>=150 && fuelCapacity<=149) {
            cost=75000;
        }
        else if(vehicleType.equalsIgnoreCase("Cruiser bikes") && mileage<=60 && fuelCapacity<=5) {
            cost=65000;
        } else if(vehicleType.equalsIgnoreCase("Cruiser bikes") && mileage>=61 && mileage<=99&&fuelCapacity>=6&&fuelCapacity<=9){
            cost=75000;
        }else if(vehicleType.equalsIgnoreCase("Cruiser bikes") && mileage>=100 && mileage<=149 &&fuelCapacity>=10 && fuelCapacity<=14){
            cost=85000;
        } else if(vehicleType.equalsIgnoreCase("Cruiser bikes") && mileage>=150 && fuelCapacity<=149) {
            cost=95000;
        }
        else if(vehicleType.equalsIgnoreCase("Touring bikes") && mileage<=60 &&fuelCapacity<=5) {
            cost=125000;
        } else if(vehicleType.equalsIgnoreCase("Touring bikes") && mileage>=61 && mileage<=99&&fuelCapacity>=6&&fuelCapacity<=9) {
            cost=135000;
        } else if(vehicleType.equalsIgnoreCase("Touring bikes") && mileage>=100 && mileage<=149&&fuelCapacity>=10&&fuelCapacity<=14){
            cost=145000;
        } else if(vehicleType.equalsIgnoreCase("Touring bikes") && mileage>=150 && fuelCapacity<=149) {
            cost=155000;
        } else if(vehicleType.equalsIgnoreCase("Sports bikes") && mileage<=60 &&fuelCapacity<=5) {
            cost=75000;
        } else if(vehicleType.equalsIgnoreCase("Sports bikes") && mileage>=61 && mileage<=99&&fuelCapacity>=6&&fuelCapacity<=9) {
            cost=85000;
        } else if(vehicleType.equalsIgnoreCase("Sports bikes") && mileage>=100 && mileage<=149&&fuelCapacity>=10&&fuelCapacity<=14){
            cost=95000;
        } else if(vehicleType.equalsIgnoreCase("Sports bikes") && mileage>=150 && fuelCapacity<=149) {
            cost=105000;
        }

        return cost;
    }
}