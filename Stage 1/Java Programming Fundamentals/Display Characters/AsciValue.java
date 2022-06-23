import java.util.*;

public class AsciValue{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numberArr = new int[4];
        // char[] numberVal = new char[4];
        System.out.print("Enter the digits:");
        for (int i=0;i<4;i++ ){
            numberArr[i] = sc.nextInt();
            
        }
        System.out.println("");
        for (int i=0; i<4;i++){
            System.out.print(numberArr[i]);
            System.out.print("-");
            System.out.print((char)numberArr[i]);
            System.out.println("");
        }
    }
}