package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month, day;

        System.out.print("Please enter the month you were born: ");
        month = input.nextInt();
        System.out.print("Please enter the day you were born: ");
        day = input.nextInt();

        if (month == 1) {
            if (day >= 1 && day < 22) {
                System.out.println("Capricorn");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Aquarius");
            }
        } else if (month == 2) {
            if (day >= 1 && day < 20) {
                System.out.println("Aquarius");
            } else if (day >= 20 && day <= 31) {
                System.out.println("Pisces");
            }
        } else if (month == 3) {
            if (day >= 1 && day < 21) {
                System.out.println("Pisces");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Aries");
            }
        } else if (month == 4) {
            if (day >= 1 && day < 21) {
                System.out.println("Aries");
            } else if (day >= 21 && day <= 31) {
                System.out.println("Taurus");
            }
        } else if (month == 5) {
            if (day >= 1 && day < 22) {
                System.out.println("Taurus");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Gemini");
            }

        } else if (month == 6) {
            if (day >= 1 && day < 23) {
                System.out.println("Gemini");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Crab");
            }

        } else if (month == 7) {
            if (day >= 1 && day < 23) {
                System.out.println("Crab");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Leo");
            }

        } else if (month == 8) {
            if (day >= 1 && day < 23) {
                System.out.println("Leo");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Virgo");
            }

        } else if (month == 9) {
            if (day >= 1 && day < 23) {
                System.out.println("Virgo");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Libra");
            }

        } else if (month == 10) {
            if (day >= 1 && day < 23) {
                System.out.println("Libra");
            } else if (day >= 23 && day <= 31) {
                System.out.println("Scorpio");
            }

        } else if (month == 11) {
            if (day >= 1 && day < 22) {
                System.out.println("Scorpio");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Sagittarius");
            }

        } else if (month == 12) {
            if (day >= 1 && day < 22) {
                System.out.println("Sagittarius");
            } else if (day >= 22 && day <= 31) {
                System.out.println("Capricorn");
            }

        }
    }
}
