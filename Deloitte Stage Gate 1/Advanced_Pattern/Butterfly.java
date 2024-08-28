
public class Butterfly {
    public static void main(String[] args) {
        int n=5;

        //upper half
        for (int i = 1; i <=n; i++) {
            //1st part
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >=1; i--) {
            //1st part
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
