import java.util.Objects;

public class Vehicle implements Loan,Insurance{

    private String vehicleNumber;
    private String modelName;
    private String vehicleType;
    private double price;

    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {

        this.vehicleNumber = vehicleNumber;
        this.modelName = modelName;
        this.vehicleType=vehicleType;
        this.price = price;
    }

    @Override
    public double issueLoan() {
        if(Objects.equals(vehicleType, "4 wheeler")){
            return price*0.8;
        }
        if(Objects.equals(vehicleType,"3 wheeler")){
            return 0.75*price;
        }
        return 0.5*price;
    }

    @Override
    public double takeInsurance() {
        if(price<=150000){
            return 3500;
        }
        if (price>=150000 && price<=300000){
            return 4000;
        }
        return 5000;
    }
}

