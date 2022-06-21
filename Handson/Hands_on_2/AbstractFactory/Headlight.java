package Handson.Hands_on_2.AbstractFactory;

public abstract class Headlight {
    public final String model;

    public Headlight(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
