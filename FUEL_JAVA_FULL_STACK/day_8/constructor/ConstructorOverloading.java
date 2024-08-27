package Day_8.constructor;

import COMPLETECODE.TillLesson11.L1VariablesandDataTypes.input;
import Day_8.constructor.Constructor_param.Student;

public class ConstructorOverloading {
    
    static class Student1{
        String name;
        int age;
        int rollno;

        Student1(String name,int age,int rollno){
            this.name=name;
            this.age=age;
            this.rollno=rollno;
            
        }

        void printnow(){
            System.out.println("Name   " +    this.name     + "   age   "+ this.age+ "    roll no   "+ this.rollno);
        }
        Student1(int age,int rollno){
            this.age=age;
            this.rollno=rollno;
        }
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1(22, 10);
        Student1 s2 = new Student1("HAMZA",22,20);

        s2.printnow();
        s1.printnow();
    }
}
