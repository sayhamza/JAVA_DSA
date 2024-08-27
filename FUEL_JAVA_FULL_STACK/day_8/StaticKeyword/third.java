package Day_8.StaticKeyword;

public class third {
     int a;
    void dis(){
        a=10;
        System.out.println("Hello"+a);
    }
    public static void main(String[] args) {
        third h = new third();
        h.dis();
    }

}
