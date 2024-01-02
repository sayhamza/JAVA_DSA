package questions;
import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        
        if (a<0) {
            System.out.println(" A is Negative");   
        }
        else if(a>0 ){
            System.out.println("A is Positive");
        }
        else if(a==0){
            System.out.println("A is 0");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
