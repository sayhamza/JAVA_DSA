package Day_1;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breath = sc.nextInt();
        int area = length * breath;
        System.out.println("Area is: " + area);
    }
}
