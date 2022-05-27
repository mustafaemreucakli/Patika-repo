package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price, km;
        double pricePerKilometer = 6.30;
        double startPrice = 9.80;
        double minPrice = 28;

        System.out.print("Please enter how many kilometers you will travel: ");
        km = input.nextDouble();
        price = startPrice + (km * pricePerKilometer);

        boolean priceStatus = price >= minPrice;

        double finalPrice = priceStatus ? price : minPrice;

        System.out.println("Total amount you have to pay: " + finalPrice + " TL");

    }

}
