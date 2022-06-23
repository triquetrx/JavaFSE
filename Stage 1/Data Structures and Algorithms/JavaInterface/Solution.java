package Handson.HackerRank.JavaInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loopFor = Integer.parseInt(scanner.next());
        ArrayList<String> input = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i <= loopFor; i++) {
            input.add(scanner.nextLine());
        }

        for (int i = 0; i <= loopFor; i++) {
            a.set(i, Integer.parseInt(input.get(i).split(" ")[0]));
            b.set(i, Integer.parseInt(input.get(i).split(" ")[1]));
            n.set(i, Integer.parseInt(input.get(i).split(" ")[2]));
        }

        for (int i = 0; i <= loopFor; i++) {
            int value = a.get(i);
            for (int j = 0; j < n.get(i); j++) {
                System.out.print(value + " ");
                value += b.get(i) * j;

            }
            System.out.println("");
        }
    }
}