import java.util.*;

public class SnacksDetails{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought:");
        int pizzas = sc.nextInt();
        System.out.println("Enter the no of puffs bought:");
        int puffs = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought:");
        int drinks = sc.nextInt();
        System.out.println("Bill Details");
        System.out.printf("\nNo of pizzas:%d",pizzas);
        System.out.printf("\nNo of puffs:%d",puffs);
        System.out.printf("\nNo of cooldrinks:%d",drinks);
        System.out.printf("\nTotal price=%d\n",(pizzas*100+puffs*20+drinks*10));
        System.out.println("ENJOY THE SHOW!!!");
    }
}