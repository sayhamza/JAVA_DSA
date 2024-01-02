package LL_Java11.Class;

public class Main {

    public static void main(String[] args) {

        // new Traingle() is constructor method
        Triangle traingleA = new Triangle(15,20,10,10,10);
        // Triangle traingleB = new Triangle(15,20,10,10,10);

        //Find Area of each instance
        //here .findArea() is instance method.
        double traingleA_Area=traingleA.findArea();
        System.out.println(traingleA_Area);

        // double traingleB_Area=traingleB.findArea();
    }
    

}
