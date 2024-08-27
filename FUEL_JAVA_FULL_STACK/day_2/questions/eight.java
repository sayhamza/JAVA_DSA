package Day_2.questions;
import java.util.*;

public class eight {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an alphabet:");
        char alphabet = sc.next().charAt(0);

        alphabet = Character.toLowerCase(alphabet);



        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println(alphabet + " is a vowel");
        } 
        
        else if ((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z')) {
            System.out.println(alphabet + " is a consonant");
        } 
        
        
        else {
            System.out.println("Input is not an alphabet");
        }


    }
}
