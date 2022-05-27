package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double heat;

        System.out.print("Please enter the air temperature in degrees: ");
        heat = input.nextDouble();

        if (heat <= 5) {
            System.out.println("You can ski in this weather.");
        } else if (5 < heat && heat <= 15) {
            System.out.println("You can go to the cinema in this weather.");
        } else if (15 < heat && heat <= 25) {
            System.out.println("You can have a picnic in this weather.");
        } else if (25 < heat) {
            System.out.println("You can swim in this weather.");
        }
        else {
            System.out.println("There is an error in the information you entered.");
        }

    }

}
