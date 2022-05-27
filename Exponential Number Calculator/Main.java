package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int base, exponent;
        int total = 1;

        System.out.print("Number to base: ");
        base = input.nextInt();
        System.out.print("Number to be exponent: ");
        exponent = input.nextInt();

        for (int i = 1; i <= exponent; i++) {
            total *= base;
        }

        System.out.println(total);

    }
}
