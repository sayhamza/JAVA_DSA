package questions;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A");
        int a = sc.nextInt();
        System.out.println("Enter B");
        int b = sc.nextInt();
        System.out.println(" Enter C");
        int c = sc.nextInt();

        if (a>b && a>c) {
            System.out.println(" A is greater");   
        }
        else if(b>c && b<a ){
            System.out.println("B is Greater");
        }
        else if(c>a&&c>b){
            System.out.println("C is Greater");
        }
        else{
            System.out.println("Invalid Input");
        }

    }
}
