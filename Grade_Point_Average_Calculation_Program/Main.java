package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double math, physics, chemistry, turkish, history, music, average;

        System.out.print("Please enter your math grade: ");
        math = input.nextDouble();
        System.out.print("Please enter your physics grade: ");
        physics = input.nextDouble();
        System.out.print("Please enter your chemistry grade: ");
        chemistry = input.nextDouble();
        System.out.print("Please enter your turkish grade: ");
        turkish = input.nextDouble();
        System.out.print("Please enter your history grade: ");
        history = input.nextDouble();
        System.out.print("Please enter your music grade: ");
        music = input.nextDouble();

        average = (math + physics + chemistry + turkish + history + music) / 6;

        System.out.println("Your Grade Point Average: " + average);

        boolean condition = average >= 60;
        String status = condition ? "You passed the class, congratulations!" : "Sorry, you failed the class!";

        System.out.println(status);


    }

}
