//  if, if-else, else-if, switch.

package conditions;

public class condition {

    public int if_Statement(int a){
        if (a<18) { 
            System.out.println("true");
        }
        return a;
    }


    public int if_else(int age){
        if (age>=18) {
            System.out.println("You Can Vote");
        } else {
            System.out.println("You Cannot Vote");
        }

        return age;
    }


    public int else_if(int marks){

        if (marks<50) {
            System.out.println("D Grade");
        }
        
        else if(marks>60 && marks<70){
            System.out.println("C Grade");
        }

        else if(marks>70 && marks<80){
            System.out.println("B Grade");
        }
        
        else if(marks>80 && marks<90){
            System.out.println("A Grade");
        }
        else{
            System.out.println("Invalid");
        }
        
        return marks;

    }

    // public int switchStatement(){
        
        
    // }

    

     public static void main(String[] args) {
 
        int a=10;

        condition check_if = new condition();
        check_if.if_Statement(a);

        int age=18;

        condition check_if_else = new condition();
        check_if_else.if_else(age);

        
        int marks=81;

        condition check_else_if = new condition();
        check_else_if.else_if(marks);

        



          
     }

    
}
