package Day_1;
public class seventh {
    public static void main(String[] args) {
        // Print 9 rows of stars and stripes
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("* * * * * * ==================================");
            } else {
                System.out.println(" * * * * *  ==================================");
            }
        }

        // Print remaining stripes
        for (int i = 0; i < 6; i++) {
            System.out.println("==============================================");
        }
    }
}