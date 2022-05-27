package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numberOne, numberTwo, numberThree;

        System.out.println("Please enter the 3 numbers you want to sort.");
        numberOne = input.nextDouble();
        numberTwo = input.nextDouble();
        numberThree = input.nextDouble();

        if (numberOne > numberTwo && numberOne > numberThree) {
            if (numberTwo > numberThree) {
                System.out.println(numberThree + " < " + numberTwo + " < " + numberOne);
            } else if (numberThree > numberTwo) {
                System.out.println(numberTwo + " < " + numberThree + " < " + numberOne);
            }
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            if (numberOne > numberThree) {
                System.out.println(numberThree + " < " + numberOne + " < " + numberTwo);
            } else if (numberThree > numberOne) {
                System.out.println(numberOne + " < " + numberThree + " < " + numberTwo);
            }
        } else if (numberThree > numberOne && numberThree > numberTwo) {
            if (numberOne > numberTwo) {
                System.out.println(numberTwo + " < " + numberOne + " < " + numberThree);
            } else if (numberTwo > numberOne) {
                System.out.println(numberOne + " < " + numberTwo + " < " + numberThree);
            }
        }

    }

}
