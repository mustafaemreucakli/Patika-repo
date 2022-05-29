package Projects;
import java.util.Scanner;

public class Main {

        static int result = 1;
        static int exponent (int exp, int base){
            if (exp == 0)
                return 1;

            result *= base;
            exponent(exp-1,base);
            return result;
        }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int exp, base;

        System.out.print("Enter the base number: ");
        base = input.nextInt();

        System.out.print("Enter the exponent number:  ");
        exp = input.nextInt();

        System.out.println("Result: "+exponent(exp,base));

    }
}