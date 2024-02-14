package FUEL_JAVA_FULL_STACK_day_8.OOPs.Inheritance;


 class Vehicle {
    void drive(){
        System.out.println("Drive the car");
    }
    
}


 class Car extends Vehicle {

    void honda(){
        System.out.println("Speed 90 of Honda");
    }
    
}


public class inheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
        c.honda();
    }

}
