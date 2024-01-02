package LL_Java11.Qustion_class;

public class StudentProfile {
    
    String fullname;
    String degree;
    double gpa;
    int yearOfGrad;

    public StudentProfile(String fullname, String degree, double gpa, int yearOfGrad){
        this.fullname=fullname;
        this.degree=degree;
        this.gpa=gpa;
        this.yearOfGrad=yearOfGrad;
    }

    public void incrementExpectedGradYear(){
        this.yearOfGrad = this.yearOfGrad=yearOfGrad+1;
    }
    
}
