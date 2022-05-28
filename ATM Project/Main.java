package Projects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName,Password;

        int remain=3, balance=1500, select, add, subtract;

        do {
            System.out.print("Username:");
            userName=input.nextLine();
            System.out.print("Password:");
            Password=input.nextLine();

            if (userName.equals("admin") && Password.equals("123")){
                System.out.println("Welcome the Bank!");

                do {
                    System.out.println("---------\n"+"1-Deposit Money\n"+"2-Withdraw Money\n"
                            +"3-Balance Inquiry\n"+"4-Exit\n"+"----------------------------------------------------");
                    System.out.print("Select The Option:");

                    select=input.nextInt();

                    switch (select){

                        case 1:
                            System.out.print("Enter the Amount you want to add:");
                            add=input.nextInt();
                            balance+=add;
                            break;

                        case 2:
                            System.out.print("Enter the Amount you want to subtract:");
                            subtract = input.nextInt();

                            if (balance>subtract) {

                                balance -= subtract;

                            }else {
                                System.out.println("Insufficient Balance");
                            }

                            break;

                        case 3:
                            System.out.println("-----------------");
                            System.out.println("Your Balance:"+balance);
                            break;

                        case 4:
                            System.out.println("Bye Bye");
                            remain=0;
                            break;
                    }

                }while(select !=4);

            }else{
                System.out.println("Wrong Value\n"+"Remaining Right:"+--remain);

                if(remain==0){
                    System.out.println("Your Account Bloked Please Call The Bank");
                }
            }

        }while (remain>0);
    }
}