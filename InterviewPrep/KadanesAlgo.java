//Q) https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&difficulty[]=0&difficulty[]=1&sortBy=submissions
package InterviewPrep;

public class KadanesAlgo {
    
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    public static long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long cs = 0;
        long ms = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];
            
            if(cs>ms){
                ms=cs;
            }
            if (cs < 0){
                cs = 0;
            }      
        }
        return ms;
        
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[]={1,2,3,-2,5};
        long max = maxSubarraySum(arr, n);
        System.out.println("Maximum subarray sum: "+ max);
    }
}
