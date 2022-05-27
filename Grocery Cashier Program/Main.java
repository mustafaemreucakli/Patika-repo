package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pear = 2.14;
        double apple = 3.67;
        double tomato = 1.11;
        double banana = 0.95;
        double eggplant = 5;
        double kg, price;

        System.out.println("How many kilos of pears did you buy?: ");
        kg = input.nextDouble();
        price = kg * pear;
        System.out.println("How many kilos of apple did you buy?: ");
        kg = input.nextDouble();
        price += kg * apple;
        System.out.println("How many kilos of tomato did you buy?: ");
        kg = input.nextDouble();
        price += kg * tomato;
        System.out.println("How many kilos of banana did you buy?: ");
        kg = input.nextDouble();
        price += kg * banana;
        System.out.println("How many kilos of eggplant did you buy?: ");
        kg = input.nextDouble();
        price += kg * eggplant;

        System.out.println("Total amount due: " + price + " TL");
    }

}
