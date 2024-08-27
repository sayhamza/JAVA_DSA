package Day_8.OOPs.Inheritance;
public class Hierarchical {
    public static void main(String[] args) {
        E e1 = new E();
        e1.showA();
        e1.showE();
        
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

class C extends A {
    void showC() {
        System.out.println("This is C");
    }
}

class D extends B {
    void showD() {
        System.out.println("This is D");
    }
}

class E extends B {
    void showE() {
        System.out.println("This is E");
    }
}


//       A
//     /   \
//    B     C
//   / \
//  D   E