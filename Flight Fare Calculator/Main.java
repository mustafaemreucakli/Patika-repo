package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double km, price;
        int age, flightType;
        double kmPrice = 0.10;

        System.out.print("Enter the distance in km: ");
        km = input.nextDouble();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter the trip type (1-One Direction/2-Double Direction): ");
        flightType = input.nextInt();

        if (km > 0 && age >= 0 && (flightType == 1 || flightType == 2)) {
            price = km * kmPrice;
            if (age < 12) {
                price *= 0.5;
            } else if (age >= 12 && age < 24) {
                price = price - (price * 0.10);
            } else if (age >= 65) {
                price = price - (price * 0.30);
            }
            if (flightType == 2) {
                price = price - (price * 0.20);
                price *= 2;
            }
            System.out.println("Fee you have to pay: " + price + " TL");
        }
        else {
            System.out.println("You entered incorrect information!");
        }

    }
}
