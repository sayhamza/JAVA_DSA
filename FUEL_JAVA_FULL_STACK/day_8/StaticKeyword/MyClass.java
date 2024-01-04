package day_8.StaticKeyword;

public class MyClass {
    

        // Static variable
        private static int myVariable;
        
        // Non-static method
        public void myMethod() {
            // Access static variable directly
            myVariable = 10;
    
            System.out.println("Value of myVariable: " + myVariable);
        }
    
        public static void main(String[] args) {
            // Create an instance of MyClass
            MyClass s1 = new MyClass();
    
            // Call the non-static method
            s1.myMethod();
        }
    }

