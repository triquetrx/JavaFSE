import java.util.*;

public class ArrayException{
    public String getPriceDetails(){
        System.out.println("Enter the number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the price details");
        for(int i=0;i<length;i++){
            try{
                arr[i]=sc.nextInt();
            }catch(InputMismatchException e){
                return "Input was not in the correct format";
            }
        }
        System.out.println("Enter the index of the array element you want to access");
        try{
            int find = sc.nextInt();
            return "The array element is "+arr[find];
        }catch(ArrayIndexOutOfBoundsException e){
            return "Array index is out of range";
        }catch(InputMismatchException e){
            return "Input was not in the correct format";
        }
        
    }
    public static void main (String[] args) {
        /* code */
        System.out.println(new ArrayException().getPriceDetails());
    }
}