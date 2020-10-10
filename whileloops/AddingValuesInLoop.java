package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me.\nNumber: ");
        int number = input.nextInt();
        while (number != 0) {

            sum += number;
            System.out.println("The total so far is " + sum + "\nNumber: ");
            number = input.nextInt();

        }
        System.out.println("\nThe total so far is " + sum);
    }
}
