package Handson.Hands_on_2.AbstractFactory;

public class MercedesFactory extends Factory{
    @Override
    public Headlight makeHeadLight() {
        return new MercedesHeadlight();
    }

    @Override
    public Tire makeTire() {
        return new MercedesTire();
    }
}
