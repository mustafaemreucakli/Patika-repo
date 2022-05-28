package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, digit;
        int sum = 0;
        System.out.println("Please enter a number: ");
        number = input.nextInt();
        while(number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        System.out.println("Sum of Digits in Number: " + sum);

    }
}