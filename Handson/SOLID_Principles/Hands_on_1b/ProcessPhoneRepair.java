package Handson.SOLID_Principles.Hands_on_1b;

public class ProcessPhoneRepair {
    public void RepairSteps(IPhone phone){
        String part1 = phone.getPhonePart1();
        System.out.println(part1+ " repaired");
        double partCost = phone.getPart1Cost()*0.5;
        System.out.println("Repair Cost "+partCost);
    }
}
