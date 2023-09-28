//Q) https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&difficulty[]=0&difficulty[]=1&sortBy=submissions

package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersArray {
    static ArrayList<Integer> leaders(int arr[], int n){
    ArrayList<Integer> result = new ArrayList<>();
        // important
        int rightLeader = arr[n-1];
        result.add(rightLeader);
        for (int i=n-2; i>=0; i--) {
            // check if arr[i] is bigger than the current rightmost
            if (arr[i] >= rightLeader) {
                rightLeader = arr[i];
                result.add(rightLeader);
            }
        }
        Collections.reverse(result);
        System.out.println(result);
        return result;

    }
 
 public static void main(String[] args) {
        int n=6;
       int arr[]={16,17,4,3,5,2};
       leaders(arr, n);
        
    }
}