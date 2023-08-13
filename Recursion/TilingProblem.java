package Recursion;

public class TilingProblem {
    public static int tilingprob(int n){
        //BaseCase
        if (n==0||n==1) {
            return 1;
        }

        //Kaam

        //Vertical Choice 
        int vc= tilingprob(n-1);

        //Horizontal Choice
        int hc=tilingprob(n-2);
        int totalways = hc+vc;
        return totalways;

    }

    public static void main(String[] args) {
        
        System.out.println(tilingprob(0));
        
    }
    
}
