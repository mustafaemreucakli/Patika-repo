package Projects;
import java.util.Scanner;

public class Main {

    static int sum (int x, int y) {
        return x + y;
    }
    static int sub (int x, int y) {
        return x - y;
    }
    static int multiplication (int x, int y) {
        return x * y;
    }
    static int division (int x, int y) {
        return x / y;
    }
    static int exponentiation (int x, int y) {
        int total = 1;
        for (int i = 1; i <= y; i++) {
            total *= x;
        }
        return total;
    }
    static int factorial (int x) {
        int total = 1;
        for(int i = 1; i <= x; i++)
        {
            total = total * i;
        }
        return total;
    }
    static int mod (int x, int y) {
        int total = 0;
        total = x % y;
        return total;
    }
    static void rectangular (int x, int y) {
        int area = 0, perimeter = 0;
        perimeter = 2 * (x + y);
        area = x * y;
        System.out.println("Perimeter: " + perimeter + " Area: " + area);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1, number2, operation = 0;

        System.out.print("Please enter the first number: ");
        number1 = input.nextInt();
        System.out.print("Please enter the second number: ");
        number2 = input.nextInt();

        while (operation != 9){
        System.out.println("Please select the operation you want to do: \n1- Summation\n2- Subtraction\n3- Multiplication\n4- Division\n5- Exponentiation" +
                "\n6- Factorial\n7- Mod\n8- Rectangular Area and Perimeter Calculation\n9- Exit");
        operation = input.nextInt();
            if (operation == 1) {
                System.out.println(sum(number1, number2));
                continue;
            } else if (operation == 2) {
                System.out.println(sub(number1, number2));
                continue;
            } else if (operation == 3) {
                System.out.println(multiplication(number1, number2));
                continue;
            } else if (operation == 4) {
                System.out.println(division(number1, number2));
                continue;
            } else if (operation == 5) {
                System.out.println(exponentiation(number1, number2));
                continue;
            } else if (operation == 6) {
                System.out.println(number1 + "! = " + factorial(number1));
                System.out.println(number2 + "! = " + factorial(number2));
                continue;
            } else if (operation == 7) {
                System.out.println(mod(number1, number2));
                continue;
            } else if (operation == 8) {
                rectangular(number1, number2);
                continue;
            }
        }

            System.out.println("Good Bye!");


    }
}