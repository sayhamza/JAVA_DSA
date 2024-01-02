package questions;
import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        
        if (a % 5 == 0 && a%11==0) {
            System.out.println(" A is Divi by 5 and 11 ");   
        }
        else{
            System.out.println("Not Divi by both");
        }
    }
}
