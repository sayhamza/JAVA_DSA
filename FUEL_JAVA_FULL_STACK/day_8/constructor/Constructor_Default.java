package day_8.constructor;

public class Constructor_Default {

    //static needs to be written  it doesnot require instance
    
     static class Bike1 {
        
        void Bike1(){
            System.out.println("Bike 1 METHOD CALLING");
        } 
    }
    public static void main(String[] args) {
        Bike1 b1 = new Bike1();
        
    }
    
}