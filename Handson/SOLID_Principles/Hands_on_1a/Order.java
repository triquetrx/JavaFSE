package Handson.SOLID_Principles.Hands_on_1a;

public class Order implements IOrder{
    @Override
    public void ProcessOrder(String modelName) {
        System.out.println(modelName + " order accepted!");
    }
}
