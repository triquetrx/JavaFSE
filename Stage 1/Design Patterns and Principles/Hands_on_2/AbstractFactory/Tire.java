package Handson.Hands_on_2.AbstractFactory;

public abstract class Tire {
    public final String model;

    public Tire(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
