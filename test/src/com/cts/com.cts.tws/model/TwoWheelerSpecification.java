package com.cts.tws.model;

public class TwoWheelerSpecification {
    private String twoWheelerType;
    private String modelNumber;
    private String engineType;
    private String frontBreak;
    private String rearBreak;
    private double mileage;
    private double maxPower;
    private double fuelCapacity;
    private int displacement;
    private int numberOfCylinders;
    private double vehicleCost;

    public TwoWheelerSpecification() {
    }

    public TwoWheelerSpecification(String twoWheelerType, String modelNumber,
                                   String engineType, String frontBreak,
                                   String rearBreak, double mileage, double maxPower,
                                   double fuelCapacity, int displacement, int numberOfCylinders,
                                   double vehicleCost) {
        super();
        this.twoWheelerType = twoWheelerType;
        this.modelNumber = modelNumber;
        this.engineType = engineType;
        this.frontBreak = frontBreak;
        this.rearBreak = rearBreak;
        this.mileage = mileage;
        this.maxPower = maxPower;
        this.fuelCapacity = fuelCapacity;
        this.displacement = displacement;
        this.numberOfCylinders = numberOfCylinders;
        this.vehicleCost = vehicleCost;
    }

    public String getTwoWheelerType() {
        return twoWheelerType;
    }

    public void setTwoWheelerType(String twoWheelerType) {
        this.twoWheelerType = twoWheelerType;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getFrontBreak() {
        return frontBreak;
    }

    public void setFrontBreak(String frontBreak) {
        this.frontBreak = frontBreak;
    }

    public String getRearBreak() {

        return rearBreak;
    }

    public void setRearBreak(String rearBreak) {
        this.rearBreak = rearBreak;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public double getVehicleCost() {
        return vehicleCost;
    }

    public void setVehicleCost(double vehicleCost) {
        this.vehicleCost = vehicleCost;
    }

    @Override
    public String toString() {
        return "TwoWheelerSpecification [twoWheelerType=" + twoWheelerType
                + ", modelNumber=" + modelNumber
                + ", engineType=" + engineType + ", frontBreak=" +
                frontBreak + ", rearBreak=" + rearBreak + ", mileage=" + mileage + ", maxPower=" + maxPower + ", fuelCapacity = " + fuelCapacity
                + ", displacement=" + displacement + ", numberOfCylinders = " + numberOfCylinders + ", vehicleCost = "
                + vehicleCost + "]";

    }
}