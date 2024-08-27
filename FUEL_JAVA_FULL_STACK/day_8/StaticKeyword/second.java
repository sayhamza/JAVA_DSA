package Day_8.StaticKeyword;

public class second {
    

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
            second s1 = new second();
            third c = new third();
    
            // Call the non-static method
            s1.myMethod();
            c.dis();
        }
    }

