package Projects;
import java.util.Scanner;

public class Main {

    static boolean isPrime(int n,int m) {
        if(n <= 2){
            return (n == 2) ? true : false;
        }
        if(m == n){
            return true;
        }
        if(n % m == 0){
            return false;
        }


        return isPrime(n,m+1);

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();
        if(isPrime(number,2)){
            System.out.println(number + " is a prime number.");
        }
        else{
            System.out.println(number + " is a prime number.");
        }
    }

}