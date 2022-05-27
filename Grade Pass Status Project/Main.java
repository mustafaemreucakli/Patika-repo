package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double math, physics, turkish, chemistry, music, average;
        int numLesson = 5;

        System.out.print("Please enter your math grade: ");
        math = input.nextDouble();
        if (math < 0 || math > 100) {
            numLesson--;
            math = 0;
        }
        System.out.print("Please enter your physics grade: ");
        physics = input.nextDouble();
        if (physics < 0 || physics > 100) {
            numLesson--;
            physics = 0;
        }
        System.out.print("Please enter your turkish grade: ");
        turkish = input.nextDouble();
        if (turkish < 0 || turkish > 100) {
            numLesson--;
            turkish = 0;
        }
        System.out.print("Please enter your chemistry grade: ");
        chemistry = input.nextDouble();
        if (chemistry < 0 || chemistry > 100) {
            numLesson--;
            chemistry = 0;
        }
        System.out.print("Please enter your music grade: ");
        music = input.nextDouble();
        if (music < 0 || music > 100) {
            numLesson--;
            music = 0;
        }

        average = (math + physics + turkish + chemistry + music) / numLesson;

        if (average >= 55) {
            System.out.println("You passed the class, congratulations!");
        }
        else {
            System.out.println("Sorry, you failed the class!");
        }
        System.out.println("Your Grade Point Average: " + average);


    }

}
