package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int i = 0;
        int count = 0;

        System.out.print("Please enter a number: ");
        number = input.nextInt();

        while (i <= number){
            count++;
            System.out.println(count + ". number " + i);
            i += 20;
        }
    }
}
