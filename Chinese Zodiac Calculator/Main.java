package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int birthYear, zodiac;

        System.out.print("Please enter your year of birth: ");
        birthYear = input.nextInt();
        zodiac = birthYear % 12;

        switch (zodiac) {
            case 0:
                System.out.println("Your Chinese Zodiac Sign: The Monkey");
                break;
            case 1:
                System.out.println("Your Chinese Zodiac Sign: The Cockerel");
                break;
            case 2:
                System.out.println("Your Chinese Zodiac Sign: The Dog");
                break;
            case 3:
                System.out.println("Your Chinese Zodiac Sign: The Pig");
                break;
            case 4:
                System.out.println("Your Chinese Zodiac Sign: The Mouse");
                break;
            case 5:
                System.out.println("Your Chinese Zodiac Sign: The Bull");
                break;
            case 6:
                System.out.println("Your Chinese Zodiac Sign: The Tiger");
                break;
            case 7:
                System.out.println("Your Chinese Zodiac Sign: The Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese Zodiac Sign: The Dragon");
                break;
            case 9:
                System.out.println("Your Chinese Zodiac Sign: The Snake");
                break;
            case 10:
                System.out.println("Your Chinese Zodiac Sign: The Horse");
                break;
            case 11:
                System.out.println("Your Chinese Zodiac Sign: The Sheep");
                break;
        }
    }
}
