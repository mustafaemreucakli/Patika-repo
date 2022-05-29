package Projects;
import java.util.Scanner;

public class Main {

    static int method (int x) {
        if(x<=0){
            return x;
        }else{
            System.out.print(x+" ");
            return method(x-5);
        }

    }

    static int methodTwo(int x,int y) {
        if(x>y){
            return x;
        }else{
            System.out.print(x+" ");
            return methodTwo(x+5,y);
        }

    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int sayi = input.nextInt();
        methodTwo(method(sayi),sayi);
    }
}