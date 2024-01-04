package MyPractise.OOPs;

public class Inheritance {
    public static class Animals {
        String color;

        void eat() {

            System.out.println("Eats");

        }

        void breathe() {
            System.out.println("Breathes");
        }
    }

    public static class Fish extends Animals {
        int fins;

        void swims() {
            System.out.println("Fish Swims");

        }
    }
    public static void main(String[] args) {
        Animals mamal=new Animals();
        mamal.eat();
        Fish shark = new Fish();
        shark.eat();
        shark.swims();

        Fish tuna = new Fish();
        tuna.eat();
        tuna.swims();
        
    }
 
}
