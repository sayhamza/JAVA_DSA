package day_8.StaticKeyword;

public class Main {
    
    static class Student1{
        String name;
        int age;
        int rollno;
        static String college = "DVVP COE";

         Student1(String name,int age,int rollno){
            this.name=name;
            this.age=age;
            this.rollno=rollno;
            
        }

         void printnow(){
            System.out.println("Name   " +    this.name     + "   age   "+ this.age+ "    roll no   "+ this.rollno+"  College  " +college);
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

        Student1.college="Pravara";
        System.out.println(Student1.college);

        s2.printnow();
        
    }
}
