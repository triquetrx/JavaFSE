import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        String[] arr = new String[limit];
        double[] discounts = new double[limit];
        String[] product = new String[limit];

        double minDiscount = Double.MAX_VALUE;
        for(int i=0; i<limit; i++){
            arr[i] = sc.next();
            product[i] = arr[i].split(",")[0];
            discounts[i] = (Double.parseDouble(arr[i].split(",")[2])/100)*Double.parseDouble(arr[i].split(",")[1]) ;
            if(discounts[i] < minDiscount)
                minDiscount = discounts[i];
        }

        for(int i=0; i<limit;i++){
            if(discounts[i] == minDiscount)
                System.out.println(product[i]);
        }
    }
}