package Handson.SOLID_Principles.Hands_on_1a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our site.\n Would you like to order or repair");
        String processOption = sc.next().trim().toLowerCase();
        String productDetails;

        switch (processOption) {
            case "order" -> {
                Order order = new Order();
                System.out.println("Please provide the phone model name");
                productDetails = sc.next().trim();
                order.ProcessOrder(productDetails);
            }
            case "repair" -> {
                Repair repair = new Repair();
                System.out.println("Is it a phone or accessory that you want to be repaired?");
                String productType = sc.next().trim();
                if (productType.equalsIgnoreCase("phone")) {
                    System.out.println("Please provide the phone model name");
                    productDetails = sc.next().trim();
                    repair.ProcessPhoneRepair(productDetails);
                } else {
                    System.out.println("Please provide the accessory details like headphone, tempered glass");
                    productDetails = sc.next().trim();
                    repair.ProcessAccessoryRepair(productDetails);
                }
            }
            default -> {
            }
        }
    }
}
