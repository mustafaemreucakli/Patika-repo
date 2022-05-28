package Projects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number: ");
        int number = input.nextInt();

        if(isPalindrome(number)){
            System.out.println(number + " is a palindrome number.");
        }else{
            System.out.println(number + " is not a palindrome number.");
        }
    }
    public static boolean isPalindrome(int number){

        String str = "" + number;
        for (int i = 0 ; i<(str.length())/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;

    }
}