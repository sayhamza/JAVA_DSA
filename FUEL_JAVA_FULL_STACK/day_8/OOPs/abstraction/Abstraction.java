// Abstraction is details hiding and showing only the required details


// Encapsulation is data hiding


public class Abstraction {
    public static void main(String[] args) {
       Honda1 car = new Honda1();
       car.run();
       
       
     }
}

    abstract class Honda {
    abstract void run();
    }

  
     class Honda1 extends Honda {
    
        void run(){
            System.out.println("Running Safely");
        }
    }

    

