package Projects;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int array_length, number;

        System.out.print("How many elements does your array consist of? ");
        array_length = input.nextInt();

        int[] array = new int[array_length];

        System.out.print("Please enter the elements of the array: ");
        for (int i = 0; i < array_length; i++) {
            number = input.nextInt();
            array[i] = number;
        }

        System.out.println("Your Array: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Your array is sorted: " + Arrays.toString(array));

    }
}