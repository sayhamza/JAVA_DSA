package day_8.constructor;

public  class Constructor_param {
    

     public static class Student {
            int id;
            String name;


             Student(int id,String name){
                this.id = id;
                this.name = name;
                System.out.println("Name : " +this.name);

            }
            
        public static void main(String[] args) {
            Student s1 = new Student(1, "HAMZA");
        }
    }
}
