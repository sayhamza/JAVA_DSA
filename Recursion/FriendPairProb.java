package Recursion;

public class FriendPairProb {

    public static int friendpair(int n){
        if (n==1||n==2) {
            return n;
        }
        int fnm1 = friendpair(n-1);
        int fnm2= friendpair(n-2);
        int pairways=(n-1)*fnm2;
        int totalways=fnm1+pairways;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(friendpair(4));;
    }
    
}
