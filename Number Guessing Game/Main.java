package Projects;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number, random;
        int value, remaining = 4;

        random = Math.random() * 100;
        value = (int)random;
        System.out.println(value);

        for (int i = 1; i <= 5; i++){
            System.out.print("Guess the number: ");
            number = input.nextInt();
            if (number == value) {
                System.out.println("Congratulations, you know.");
                break;
            } else if (number != value) {
                if (remaining == 0) {
                    break;
                }
                System.out.println("Sorry, you didn't know. Your remaining right: " + remaining);
                remaining--;
            }
        }

        if (remaining == 0) {
            System.out.println("You have no more guessing. The number was " + value + ".");
        }


    }
}