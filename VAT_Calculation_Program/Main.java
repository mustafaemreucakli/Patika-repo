package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double price,inludedKdv;
        double kdvRateOne = 0.18;
        double kdvRateTwo = 0.08;

        System.out.print("Please enter the price of the product excluding VAT: ");
        price = input.nextDouble();
        boolean kdv = price >= 1000;
        double includedKdv = kdv ? (price + (price * kdvRateTwo)) : (price + (price * kdvRateOne));

        System.out.println("The price of the product including VAT: " + includedKdv);

        String kdvType = kdv ? "8% VAT is applied to the price of the product." : "18% VAT is applied to the price of the product.";

        System.out.println(kdvType);

    }

}
