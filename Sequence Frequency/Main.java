package Projects;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {45, 56, 23, 12, 45, 56, 78, 89, 12, 23, 56};
        int[] repeat = new int[array.length];

        for (int i = 0; i < array.length; i++)
            repeat[i] = 1;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    repeat[i]++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    array[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (repeat[i] > 1) {
                if (array[i] != 0)
                    System.out.println(array[i] + " number is " + repeat[i] + " repeated.");
            }
        }

    }
}