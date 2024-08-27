package Day_3;
public class dowhile {
    public static void main(String[] args) {

                int number = 1;

                do {
                    if (number % 2 == 0) {
                        System.out.println(number + " is an even number.");
                    } else {
                        System.out.println(number + " is an odd number.");
                    }
                    number++;
                   } while (number <= 10);
      }
        
}

