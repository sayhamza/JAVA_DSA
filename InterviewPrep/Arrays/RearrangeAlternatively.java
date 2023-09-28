//https://practice.geeksforgeeks.org/problems/-rearrange-array-alternately/0/
package InterviewPrep.Arrays;

import java.util.Arrays;

public class RearrangeAlternatively {
    
    // temp: input array
    // n: size of array
    //Function to rearrange  the array elements alternately.
    public static void rearrange(long arr[], int n){
        // Your code here
        long[] result=new long[arr.length];
        n=arr.length-1;

        for (int i = 0; i < n/2; i++) {
            result[i*2]=arr[n-i];
            if (2*i+1<arr.length) {
                result[2 * i + 1] = arr[i];
            }
        }
        for(int i=0;i<arr.length;++i){
	 	    arr[i]=result[i];
            System.out.println(Arrays.toString(result));
	 	}

    }

    public static void main(String[] args) {
        int n = 6;
        long arr[]={1,2,3,4,5,6};
        rearrange(arr, n);
    }
}

