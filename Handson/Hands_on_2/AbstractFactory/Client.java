package Handson.Hands_on_2.AbstractFactory;

import java.util.Objects;

public class Client {
    public static void main(String[] args) {
        Tire audiTire = Objects.requireNonNull(FactoryGetter.getFactory("audi")).makeTire();
        Tire mercedesTire = Objects.requireNonNull(FactoryGetter.getFactory("mercedes")).makeTire();
        System.out.println(audiTire.getModel());
        System.out.println(mercedesTire.getModel());
        Headlight audiHeadlight = Objects.requireNonNull(FactoryGetter.getFactory("audi")).makeHeadLight();
        Headlight mercedesHeadlight = Objects.requireNonNull(FactoryGetter.getFactory("mercedes")).makeHeadLight();
        System.out.println(audiHeadlight.getModel());
        System.out.println(mercedesHeadlight.getModel());
    }
}
