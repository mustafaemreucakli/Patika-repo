package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0 ;
        int count = 1;

        do {
            number = input.nextInt();
            if (number % 4 == 0) {
                System.out.println(count + ". number: " + number);
                sum += number;
                count++;
            }
        } while (number % 2 == 0);

        System.out.println("Sum: " + sum);

    }
}
