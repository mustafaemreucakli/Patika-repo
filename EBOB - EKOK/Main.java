package Projects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOne, numberTwo, ebob = 1, ekok, i = 1;

        System.out.print("Please enter the number 1: ");
        numberOne = input.nextInt();
        System.out.print("Please enter the number 2: ");
        numberTwo = input.nextInt();

        while (i <= numberOne) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                ebob = i;
            }
            i++;

        }
        System.out.println("EBOB: " + ebob);
        ekok = (numberOne * numberTwo) / ebob;
        System.out.println("EKOK: " + ekok);
    }
}