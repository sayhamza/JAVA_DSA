// Define the package in which the code resides
package COMPLETECODE.TillLesson11.OOPs;

// Define a public class named AccessModifiers
public class AccessModifiers {

    // Define the main method which is the entry point of any Java application
    public static void main(String[] args) {
        
        // Create a new instance of the BankAccount class
        BankAccount acc = new BankAccount();

        // Set the username of the BankAccount instance to "Tharun"
        acc.username = "Tharun";

        // Call the setPassword method of the BankAccount instance to set the password to "1234"
        acc.setPassword("1234");

        // Print the username of the BankAccount instance
        System.out.println("Account Name: "+acc.username);

        
        // The following line is commented out because it tries to access a private variable
        // directly from outside its class, which is not allowed in Java
        System.out.println("Account Password: "+acc.password);
    }
}

// Define a class named BankAccount
class BankAccount {
    // Define a public instance variable named username
    public String username;

    // Define a private instance variable named password
    private String password;

    // Define a public method named setPassword to set the value of the password variable
    public void setPassword(String password) {
        this.password = password;
    }
}