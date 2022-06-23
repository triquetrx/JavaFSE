package Handson.Hands_on_2.AbstractFactory;

public class AudiFactory extends Factory{

    @Override
    public Headlight makeHeadLight() {
        return new AudiHeadlight();
    }

    @Override
    public Tire makeTire() {
        return new AudiTire();
    }
}
