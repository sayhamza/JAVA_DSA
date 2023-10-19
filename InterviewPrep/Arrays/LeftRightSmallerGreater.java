//https://practice.geeksforgeeks.org/problems/unsorted-array4925/1

package InterviewPrep.Arrays;

public class LeftRightSmallerGreater {

    public static int findElement(int arr[], int n){
        
        int[] rightSmallest = new int[n];
        int[] leftGreatest = new  int[n];
        
        // leftGreatest[i] indicates,
        // the number which is the greatest on its left side (including the element itself)
        leftGreatest[0] = arr[0];
        for (int i=1; i<n; i++){
            leftGreatest[i] = Math.max(leftGreatest[i-1], arr[i]);
        }
        
        // rightSmallest[i] indicates,
        // the number which is the smallest on its right side (including the element itself)
        rightSmallest[n-1] = arr[n-1];
        for (int i=n-2; i>=0; i--){
            rightSmallest[i] = Math.min(rightSmallest[i+1], arr[i]);
        }
        
        // Running loop from 1 to n-1 because
        // the border elements don't have smaller/greater elements on their sides
        for (int i=1; i<n-1; i++){
            // The element is greatest to its left and also smallest to its right
            // Indicating that other elements to left side are smaller than it
            // And other elements to its right are larger than that
            // So returning it
            if (leftGreatest[i] == rightSmallest[i]) return arr[i];
        }
        
        // Default return if no such element is found
        return -1;
    }
    public static void main(String[] args) {
        int n=4;
        int arr[]={4,2,5,7};
        findElement(arr, n);
    }
    }



    

