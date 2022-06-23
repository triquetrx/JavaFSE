import java.util.*;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int numberOfLiters = sc.nextInt();
        double costForLiters,costForMiles;
        if(numberOfLiters>0){
            System.out.println("Enter the distance covered");
            int distance = sc.nextInt();
            if(distance>0){
                costForLiters = (float)numberOfLiters/distance;
                System.out.printf("Liters/100KM\n%.2f", costForLiters*100);
                costForMiles = ((distance*0.6214)/(numberOfLiters*0.2642));
                System.out.printf("\nMiles/gallons\n%.2f", costForMiles);
            }
            else{
                System.out.print(distance+" is an Invalid Input");
            }
        }
        else{
            System.out.print(numberOfLiters+" is an Invalid Input");
        }
    }
}