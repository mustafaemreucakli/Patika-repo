package Projects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int digit;

        System.out.print("How many digits do you want an inverted triangle?: ");
        digit = input.nextInt();

        for (int i = 1; i <= digit; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (digit - i + 1) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}