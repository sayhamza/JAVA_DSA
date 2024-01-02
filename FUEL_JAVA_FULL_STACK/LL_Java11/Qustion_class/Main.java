package LL_Java11.Qustion_class;

public class Main {
    public static void main(String[] args) {
        StudentProfile studentOne = new StudentProfile("HAMZA", "BE IT", 9, 2024);

        studentOne.incrementExpectedGradYear();
        System.out.println(studentOne.yearOfGrad);
    }
}
