package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sum = 0;

        Scanner input = new Scanner(System.in);

        double arr[] = {1,2,3};

        for (double i: arr) {
            sum += (1 / i);
        }

        double average = arr.length / sum;
        System.out.println("Harmonic Average is " + average);

    }
}