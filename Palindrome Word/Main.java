package Projects;

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    static  boolean isPalindrom(String str){
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j)){
                return  false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word= input.nextLine();
        if (isPalindrom(word)){
            System.out.println(word+" is a palindrome Word!");
        }else {
            System.out.println(word+" is not a palindrome word!");

        }

    }
}