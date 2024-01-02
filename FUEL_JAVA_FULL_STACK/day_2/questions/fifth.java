package questions;
import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        
        if (a % 2 == 0) {
            System.out.println(" A is Even No ");   
        }
        else{
            System.out.println("A is odd");
        }
    }
}
