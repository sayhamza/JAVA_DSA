package day_4.Access_Specifier.Private_now;
import java.util.Scanner;

public class Main {
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
                System.out.println("Enter new password:");
                this.password = sc.nextLine();
                System.out.println("Password has been reset.");
            } else {
                System.out.println("Incorrect answer to security question.");
            }
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.setCredentials();
        // If the user forgets their password:
        user.forgotPassword();
    }
}