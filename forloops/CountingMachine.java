package week1.forloops;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Count to: ");
        int number = input.nextInt();
        for (int i = 0; i <= number; i++) {
            System.out.print(i + " ");
        }
    }
}
