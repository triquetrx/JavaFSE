package Handson.SOLID_Principles.Hands_on_1a;

public class Repair implements IRepair{
    @Override
    public void ProcessPhoneRepair(String modelName) {
        System.out.println(modelName + " repair accepted!");
    }

    @Override
    public void ProcessAccessoryRepair(String accessoryType) {
        System.out.println(accessoryType + " repair accepted!");
    }
}
