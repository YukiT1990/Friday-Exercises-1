package week1.ifstatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey, what's your name? (Sorry, I keep forgetting.)");

        String name = input.nextLine();
        System.out.println("Ok, " + name + ", how old are you?");

        int age = input.nextInt();
        if (age < 16) {
            System.out.println("\nYou can't drive, " + name);
        } else if (age < 18) {
            System.out.println("\nYou can drive but not vote, " + name);
        } else if (age < 25) {
            System.out.println("\nYou can vote but not rent a car, " + name);
        } else {
            System.out.println("\nYou can do pretty much anything, " + name);
        }

    }
}
