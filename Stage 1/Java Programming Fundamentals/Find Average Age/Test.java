import java.util.*;

public class Test{
    public static void calculateAverage(int[] age){
        double avg;
        int sum=0;
        for(int i=0;i<age.length;i++){
            sum+=age[i];
        }
        avg = (double)sum/age.length;
        System.out.printf("\nThe average age is %.2f",avg);
    }
    public static void main (String[] args) {
        System.out.println("Enter total no.of employees:");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        if(limit<0){
            System.out.println("Please enter a valid employee count");
        }
        else{
            int[] age = new int[limit];
            if(limit>=2){
                System.out.printf("Enter the age for %d employees:",limit);
                for(int i=0;i<limit;i++){
                    age[i]=sc.nextInt();
                    if(age[i]<28 || age[i]>40){
                        System.out.println("Invalid age encountered!");
                        System.exit(0);
                    }
                }
                calculateAverage(age);
            }
            else{
                System.out.println("Please enter a valid employee count");
                
            }
        }
    }
}