import java.util.*;

public class IncrementCalculation{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = sc.nextInt();
        System.out.println("Enter the Performance appraisal rating");
        float rating = sc.nextFloat();
        if(salary>0){
            if(rating>=1 && rating<=3){
                System.out.println((int)(salary+(salary*0.1)));
            }
            else if(rating>3 && rating<=4){
                System.out.println((int)(salary+(salary*0.25)));
            }
            else if(rating>4 && rating<=5){
                System.out.println((int)(salary+(salary*0.3)));
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}