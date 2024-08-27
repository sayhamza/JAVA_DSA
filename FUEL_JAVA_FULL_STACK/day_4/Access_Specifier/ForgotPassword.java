package Day_4.Access_Specifier;

import java.util.Scanner;

public class ForgotPassword {

    static class User {
        
        Scanner sc = new Scanner(System.in);

        String userName;
        String password;
        String securityQuestion;
        String securityAnswer;

        public void setCredentials() {
            System.out.println("Enter username:");
            this.userName = sc.nextLine();
            System.out.println("Enter password:");
            this.password = sc.nextLine();
            System.out.println("Enter security question:");
            this.securityQuestion = sc.nextLine();
            System.out.println("Enter security answer:");
            this.securityAnswer = sc.nextLine();
        }

        public void forgotPassword() {
            System.out.println("Forgot password. Answer the security question:");
            System.out.println(securityQuestion);
            String answer = sc.nextLine();

            if (answer.equals(securityAnswer)) {
                System.out.println("Your Older password is " + this.password);
            } else {
                System.out.println("Incorrect answer to security question.");
            }
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.setCredentials();
        //To validate

        // If the user forgets their password:
        user.forgotPassword();
    }
}