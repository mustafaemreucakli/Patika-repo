package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a, b, c, area;

        System.out.println("Please enter the side dimensions of the triangle whose area you want to calculate: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        double u = (a + b + c) / 2;
        area = (double) Math.sqrt (u * (u - a) * (u - b) * (u - c));
        System.out.println("Area of Triangle: " + area);

    }

}
