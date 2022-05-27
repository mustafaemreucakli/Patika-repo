package Projects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userName, password, newPassword;
        int resetPassword;

        System.out.print("Please enter your username: ");
        userName = input.nextLine();
        System.out.print("Please enter your password: ");
        password = input.nextLine();

        if(userName.equals("admin") && password.equals("123")) {
            System.out.println("You have successfully logged in!");
        }
        else {
            System.out.println("The information you entered is incorrect!");
            System.out.println("Would you like to change your password?\n1-Yes\n2-No");
            resetPassword = input.nextInt();
            if (resetPassword == 1) {
                System.out.print("Please enter your new password: ");
                Scanner input2 = new Scanner(System.in);
                newPassword = input2.nextLine();
                if (newPassword.equals("123")) {
                    System.out.println("Your new password cannot be the same as your old password!");
                }
                else {
                    System.out.println("Your new password has been successfully created.");
                }
            }
            else {
                System.out.println("Have a good day!");
            }

        }
    }

}
