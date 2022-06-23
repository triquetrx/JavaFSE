package Handson.Hands_on_3b;

public abstract class Burger implements Item{

    @Override
    public Packing packing(){
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
