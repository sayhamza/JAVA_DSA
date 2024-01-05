// Abstraction is details hiding and showing only the required details


// Encapsulation is data hiding


public class Abstraction {
    public static void main(String[] args) {
       Car car = new Car();
       car.start();
       
       Bike bike = new Bike();
       bike.start();
     }
}


    abstract class Vehicle {
    abstract void start();
    }

  
     class Car extends Vehicle {
    
        void start(){
            System.out.println("Car starts");
        }
    }

    class Bike extends Vehicle {
    
        void start(){
            System.out.println("Bike starts");
        }
    }


