package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double number;
        double sum = 0;

        System.out.print("Please enter a number: ");
        number = input.nextDouble();

        if(number > 0) {
            for (double i = 1; i <= number; i++) {
                sum = sum + (1 / i);
            }
        }
        else {
            System.out.println("You entered incorrect information!");
        }

        System.out.println(sum);

    }
}