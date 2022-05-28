package Projects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, numbers, max = 0, min = 2147483647;

        System.out.println("How many numbers will you enter: ");
        numbers = input.nextInt();

        for (int i = 1; i <= numbers; i++) {
            System.out.print("Please enter the numbers: ");
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
            for (int k = 1; k <= numbers; k++)
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Maximum number is " + " " + max);
        System.out.println("Minimum number is " + " " + min);

    }
}