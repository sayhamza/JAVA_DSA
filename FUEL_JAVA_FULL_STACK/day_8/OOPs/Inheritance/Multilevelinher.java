package Day_8.OOPs.Inheritance;
// package day_8.OOPs.Inheritance;

public class Multilevelinher {
    public static void main(String[] args) {
        C c1 = new C();
        c1.showA();
    }
}

class A {
    void showA() {
        System.out.println("This is A");
    }
}

class B extends A {
    void showB() {
        System.out.println("This is B");
    }
}

class C extends B {
    void showC() {
        System.out.println("This is C");
    }
}