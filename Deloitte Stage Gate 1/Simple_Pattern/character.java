package Simple_Pattern;

public class character {
    public static void main(String[] args) {
        int n=4;
        char ch='A';
        //outer loop
        for (int line = 0; line <=n; line++) {
            //inner loop
            for (int chars = 0; chars <=line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
