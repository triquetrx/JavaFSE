package Handson.Hands_on_3b;

import java.util.Scanner;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a meal\n1. Veg\n2. Non-Veg");
        int choice = sc.nextInt();
        if(choice==1){
            Meal meal= mealBuilder.prepareVegMeal();
            System.out.println("Veg Meal");
            meal.showItems();
            System.out.println("Total Cost: "+ meal.getCost());
        } else {
            Meal meal = mealBuilder.prepareNonVegMeal();
            System.out.println("Non-Veg Meal");
            meal.showItems();
            System.out.println("Total Cost: "+meal.getCost());
        }
    }
}
