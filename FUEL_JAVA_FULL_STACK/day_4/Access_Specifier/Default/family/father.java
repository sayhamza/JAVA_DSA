package Day_4.Access_Specifier.Default.family;

//This is Default Access Specifier 
 class father {
    String name="ABC";

}

 class main {
    public static void main(String[] args) {
        father f= new father();
        System.out.println(f.getClass());
    }
    
}
