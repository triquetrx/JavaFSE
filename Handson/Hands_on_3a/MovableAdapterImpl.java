package Handson.Hands_on_3a;

public class MovableAdapterImpl implements MovableAdapter{

    private final Movable luxuryCars;

    //Constructor
    public MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    private double convertMPHToKMPH(double mph){
        return mph*1.60934;
    }

    private double convertUSDToInr(double price){
        return price*77.70;
    }

    @Override
    public double getSpeed() {
        return convertMPHToKMPH(luxuryCars.getSpeed());
    }

    @Override
    public double getPrice() {
        return convertUSDToInr(luxuryCars.getPrice());
    }

}
