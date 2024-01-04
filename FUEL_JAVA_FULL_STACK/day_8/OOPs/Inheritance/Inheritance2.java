package day_8.OOPs.Inheritance;

class Shape {
    void getArea() {
        System.out.println("Shape area is undefined");
    }
}

class Rectangle extends Shape {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void getArea() {
        System.out.println("Rectangle area is " + length * width);
    }
}

class Circle extends Shape {
    int radius;
    
    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    void getArea() {
        double PI = 3.14;
        System.out.println("Circle area is " + PI * radius * radius);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.getArea();

        Rectangle rectangle = new Rectangle(7, 5);
        rectangle.getArea();

        Circle circle = new Circle(5);
        circle.getArea();
    }
}