package Day_2.questions;
import java.util.*;
public class ten {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an alphabet:");
        char alphabet = sc.next().charAt(0);

        if (Character.isLowerCase(alphabet)) {
            System.out.println("lower case");
        } else {
            System.out.println("upper case");
        }
    }
}
