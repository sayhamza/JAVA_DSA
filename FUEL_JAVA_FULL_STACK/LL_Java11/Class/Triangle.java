package LL_Java11.Class;

public class Triangle {
    
    //These are instance variable

    double base;
    double height;
    double sideLen1;
    double sideLen2;
    double sideLen3;


    //This is a Constructor
    public Triangle(double base,double height,double sideLen1,double sideLen2,double sideLen3){
        this.base=base;
        this.height=height;
        this.sideLen1=sideLen1;
        this.sideLen2=sideLen2;
        this.sideLen3=sideLen3;
    }

    public double findArea(){
        return (this.base*this.height) /2;
    }
}
