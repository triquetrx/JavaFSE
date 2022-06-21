package Handson.MobileHandsOn;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum range");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum range");
        int max = scanner.nextInt();
        MobileManagementSystem mobileManagementSystem = new MobileManagementSystem();
        Map<Integer,Integer> results = mobileManagementSystem.viewMobileWithInTheRange(min,max);
        if(results.isEmpty()){
            System.out.println("No mobiles found for the given range");
        }else{
            for(int result: results.keySet()){
                System.out.println(result+":"+results.get(result));
            }
        }
    }
}
