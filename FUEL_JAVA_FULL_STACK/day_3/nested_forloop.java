package Day_3;
/**
 * nested_forloop
 */
public class nested_forloop {
    static public void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    
}