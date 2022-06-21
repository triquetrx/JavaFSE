package com.cts.tws.exception;

public class VehicleCostEstimationException extends Exception{
    String strMsg1;
    Throwable strMsg2;

    public VehicleCostEstimationException(String strMsg1,Throwable strMsg2) {
        super(strMsg1,strMsg2);
    }
}