package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nHello. What is your name?");

        String name = input.nextLine();
        System.out.println("\nHi, " + name + "! How old are you?");

        int age = input.nextInt();
        System.out.println("\nSo, you're " + age + ", eh? That's not old at all!");
        System.out.println("How much do you make, " + name + "?");

        double income = input.nextDouble();
        System.out.println("\n" + income + "! I hope that's per hour and not per year! LOL!");
    }
}
