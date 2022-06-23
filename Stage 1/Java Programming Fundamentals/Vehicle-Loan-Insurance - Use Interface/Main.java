import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Vehicle vhc = new Vehicle("12345","BMW Series 6","4 wheeler",200000.00);
        System.out.println(vhc.issueLoan());
        System.out.println(vhc.takeInsurance());
    }
}