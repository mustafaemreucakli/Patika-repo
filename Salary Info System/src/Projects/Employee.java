package Projects;
import java.util.Scanner;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee (String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax () {
        double tax = 0;
        if (this.salary < 1000) {
            System.out.println("No tax will be applied to the salary.");
        } else if (this.salary >= 1000) {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    public double bonus () {
        double overtimeBonus = 0;
        if (workHours <= 40) {
            System.out.println("There is no overtime.");
        } else if (workHours > 40) {
            int overtime = workHours - 40;
            overtimeBonus = overtime * 30;
        }
        return overtimeBonus;
    }

    public double raiseSalary () {
        double raiseSalary = 0;
        //The current year is taken as 2021.
        if (hireYear > 2011) {
            raiseSalary = this.salary * 0.05;
        } else if (hireYear < 2012 && hireYear > 2001) {
            raiseSalary = this.salary * 0.10;
        } else if (hireYear < 2002) {
            raiseSalary = this.salary * 0.15;
        }
        return raiseSalary;
    }

    public String toString() {
        double total = salary - tax() + bonus() + raiseSalary();
        System.out.println("Name : "+ this.name);
        System.out.println("Salary : "+ this.salary);
        System.out.println("Work Hours : "+ this.workHours);
        System.out.println("Hire Year : "+ this.hireYear);
        System.out.println("Tax : "+ tax());
        System.out.println("Bonus : "+ bonus());
        System.out.println("Raise Salary : "+ raiseSalary());
        System.out.println("Total Salary : "+ total);

        return null;
    }



}
