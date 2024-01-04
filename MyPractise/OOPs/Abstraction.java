package MyPractise.OOPs;

public class Abstraction {
    public static void main(String[] args) {

        Animals obj =new Horse();
        obj.walk();
    }
}

abstract class Animals {
    void eat() {
        System.out.println("Eats");
    }

    abstract void walk();

}

class Horse extends Animals {
   
    void walk() {
        System.out.println("Walks on 4 legs");
    }

}
