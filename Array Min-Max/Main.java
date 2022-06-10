package Projects;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        int[] list = {56, 34, 1, 8, 201, -2, -33};

        int min = list[0];
        int max = list[0];

        System.out.println(Arrays.toString(list));
        System.out.print("Please enter the number : ");
        number = input.nextInt();

        Arrays.sort(list);

        for (int i : list) {
            if (i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                break;
            }
        }
        
        System.out.println("The nearest number smaller than the entered number : " + min);
        System.out.println("The nearest number greater than the entered number : " + max);

    }
}