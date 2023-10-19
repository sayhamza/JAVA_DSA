//https://practice.geeksforgeeks.org/problems/reverse-array-in-groups0255/1
package InterviewPrep.Arrays;

import java.util.ArrayList;

public class ReverseGroup {
    
    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        for(int i =0;i< n;i = i+k){
            int start = i; 
            int end = Math.min(n-1,i+k-1);
            while(start< end){
                int temp = arr.get(start);
                arr.set(start,arr.get(end));
                arr.set(end,temp);
                
                start++;
                end--;
                
            }
        }
        // System.out.println(arr);
    }
  

    public static void main(String[] args) {
        int n=5;
        int k=3;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        reverseInGroups(arr, n, k);

    }
}
