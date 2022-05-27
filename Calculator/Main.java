package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double valueOne, valueTwo, result;
        int operation;

        System.out.println("Please enter the first value you want to calculate: ");
        valueOne = input.nextDouble();
        System.out.println("Please enter the second value you want to calculate");
        valueTwo = input.nextDouble();
        System.out.println("Please select the operation you want to calculate.\n1-Summation\n2-Subtraction\n3-Multiplication\n4-Division");
        operation = input.nextInt();

        switch (operation) {
            case 1:
                result = valueOne + valueTwo;
                System.out.println("The result of your summation: " + result);
                break;
            case 2:
                result = valueOne - valueTwo;
                System.out.println("The result of your subtraction: " + result);
                break;
            case 3:
                result = valueOne * valueTwo;
                System.out.println("The result of your multiplication: " + result);
                break;
            case 4:
                result = valueOne / valueTwo;
                System.out.println("The result of your division: " + result);
                break;
            default:
                System.out.println("There is an error in the values you entered. Please enter the correct values.");
        }

    }

}
