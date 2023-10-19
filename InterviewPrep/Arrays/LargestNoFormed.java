//https://practice.geeksforgeeks.org/problems/largest-number-formed-from-an-array1117/1

package InterviewPrep.Arrays;

import java.util.Arrays;

public class LargestNoFormed {

    public static String printLargest(String[] arr) {
        // code here
        Arrays.sort(arr, (a,b)->(a + b).compareTo(b + a));
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--) sb.append(arr[i]);
        
        return sb.toString();
    }
    public static void main(String[] args) {
        // String[] arr= {3,30,34,5,9};
        // printLargest(arr);
    }
    
}
