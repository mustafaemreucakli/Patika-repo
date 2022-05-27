package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number, avg;
        int sum = 0;
        int i = 0;
        int count = 0;

        System.out.println("Please enter a number:");
        number = input.nextInt();

        do {
            count++;
            System.out.println(count + ". sayı: " + i);
            sum += i;
            i += 12;
        }while (i <= number);

        avg = sum / count;

        System.out.println("Average: " + avg);
    }
}
