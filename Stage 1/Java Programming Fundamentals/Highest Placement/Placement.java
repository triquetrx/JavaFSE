import java.util.*;

public class Placement{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students placed in CSE:");
        int cse = sc.nextInt();
        System.out.print("Enter the no of students placed in ECE:");
        int ece = sc.nextInt();
        System.out.print("Enter the no of students placed in MECH:");
        int mech = sc.nextInt();
        if (cse<0 || ece<0 || mech<0){
            System.out.print("Input is Invalid");
        } 
        else{
            int max = 0;
            for (int i=0; i<=3; i++){
                if(max<cse){
                    max = cse;
                }
                if(max<ece){
                    max = ece;
                }
                if(max<mech){
                    max=mech;
                }
            }
            if(max == 0 || (max == cse && max == ece && max == mech)){
                System.out.print("None of the department has got the highest placement");
            }
            else{
                System.out.println("Highest placement");
            if(max == cse){
                System.out.println("CSE");
            }
            if(max == mech){
                System.out.println("MECH");
            }
            if (max==ece){
                System.out.println("ECE");
            } 
        }
            }
            
    }
}