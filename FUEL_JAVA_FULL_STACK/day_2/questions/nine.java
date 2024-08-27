package Day_2.questions;
import java.util.*;
public class nine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter a character:");

        char character = sc.next().charAt(0);
    
        if (Character.isLetter(character)) {
            System.out.println(character + " is an Alphabet");
        } else if (Character.isDigit(character)) {
            System.out.println(character + " is a Number");
        } else {
            System.out.println(character + " is Special Character");
        }
    }

    
}