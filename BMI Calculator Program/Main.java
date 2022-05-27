package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double kilo, length, bmi;

        System.out.print("Please enter your height (m): ");
        length = input.nextDouble();
        System.out.print("Please enter your body weight (kg): ");
        kilo = input.nextDouble();

        bmi = kilo / (length * length);

        System.out.println("Your Body Mass Index: " + bmi);
    }

}
