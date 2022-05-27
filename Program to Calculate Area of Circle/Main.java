package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double r, t, area;
        double pi = 3.14;

        System.out.println("Please enter the radius of the circle:");
        r = input.nextDouble();
        System.out.println("Please enter the measure of the central angle of the circle:");
        t = input.nextDouble();

        area = (pi * (r * r) * t) / 360;

        System.out.println("Area of the Circle: " + area);
    }

}
