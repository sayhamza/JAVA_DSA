//https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

package InterviewPrep.Arrays;


import java.util.Arrays;

public class KthSmallestElement {
    
    public static int kthSmallest(int[] arr, int l, int r, int k) { 
        //Your code here
        Arrays.sort(arr);
        int ans=arr[k-1];
        System.out.println(ans);
        return arr[k-1];
        
        


    } 
    public static void main(String[] args) {
        int n=6;
        int k=3;
        int[] arr={ 7,10,4,3,20,15 };
        kthSmallest(arr, k, n, k);
    }
}
