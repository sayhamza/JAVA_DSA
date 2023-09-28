//https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays/0/
package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Merge2Array {
    public static void merge(long a[], long b[], int n, int m) 
    {
        // code here 
        int i = n-1 , j = 0;
        
        while(i>=0 && j<m){
            if(a[i] > b[j]){
                long temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                
                i--;
                j++;
            }
            else{
                i--;
                j++;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

    

    public static void main(String[] args) {
        int n = 4;
        long a[] = {1,3,5 ,7};
        int m = 5;
        long b[] = {0,2 ,6 ,8 ,9};
      
    }
}
