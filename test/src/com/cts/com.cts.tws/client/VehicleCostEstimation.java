package com.cts.tws.client;
import java.sql.SQLException;
import com.cts.tws.exception.VehicleCostEstimationException;
import com.cts.tws.service.VehicleCostEstimationService;
import com.cts.tws.skeleton.SkeletonValidator;
public class VehicleCostEstimation {
    public static void main(String[] args) throws SQLException,
            VehicleCostEstimationException
    {
        new SkeletonValidator();
        VehicleCostEstimationService mpeService = new VehicleCostEstimationService();
        mpeService.addVehicleDetails("TwoWheelerShowroom/inputfeed.txt");
    }
}