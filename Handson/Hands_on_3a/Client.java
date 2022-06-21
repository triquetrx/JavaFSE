package Handson.Hands_on_3a;

public class Client {
    public static void main(String[] args) {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.println("Speed in mph: "+bugattiVeyron.getSpeed());
        System.out.println("Speed in Km/h: "+bugattiVeyronAdapter.getSpeed());
        System.out.println("Price in USD: "+bugattiVeyron.getPrice());
        System.out.println("Price in INR: "+bugattiVeyronAdapter.getPrice());
    }
}
