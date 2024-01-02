package questions;
import java.util.*;
public class seventh {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        

        if((str.charAt(0) >= 'a') && (str.charAt(0) <= 'z') || (str.charAt(0) >= 'A') && (str.charAt(0) <= 'Z')) {
            System.out.println("alphabet");
            System.out.println();
        } else {
            System.out.println("Not a aplhabet");
        }
    }
}
