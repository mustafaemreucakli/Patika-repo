package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, r;
        int a = 1;
        int b = 1;
        int c = 1;

        System.out.println("Enter the values of the combination you want to calculate from type C(n,r): ");
        System.out.print("n: ");
        n = input.nextInt();
        System.out.print("r: ");
        r = input.nextInt();

        for (int i = 1; i <= (n-r); i++) {
            c *= i;
        }

        for (int i = 1; i <= r; i++) {
            b *= i;
        }


        for (int i = 1; i <= n; i++) {
            a *= i;
        }

        System.out.println("C(n,r) = " + a / (b * c));
    }
}
