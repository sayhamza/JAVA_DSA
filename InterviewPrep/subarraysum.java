//Q) https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&difficulty[]=0&difficulty[]=1&sortBy=submissions

package InterviewPrep;

import java.util.ArrayList;

public class subarraysum {

        public static ArrayList<Integer> findSubarrayWithSum(int N, int S, int[] arr) {
            ArrayList<Integer> result = new ArrayList<>();
            int left = 0;
            int right = 0;
            int currentSum = 0;

            if(S==0){
                result.add(-1);// Indicates no subarray found
                return result;
            }
    
            while (right < N) {
                currentSum += arr[right];
    
                while (currentSum > S) {
                    currentSum -= arr[left];
                    left++;
                }
    
                if (currentSum == S) {
                    result.add(left + 1);  // Add left index (1-based)
                    result.add(right + 1); // Add right index (1-based)
                    return result;
                }
    
                right++;
            }
    
            // If no subarray is found
            result.add(-1);
            return result;
        }
    
        public static void main(String[] args) {
            int N = 5;
            int S = 12;
            int[] arr = {1, 2, 3, 7, 5};
    
            ArrayList<Integer> result = findSubarrayWithSum(N, S, arr);
    
            if (result.get(0) == -1) {
                System.out.println("No subarray found with sum " + S);
            } else {
                System.out.println("Subarray with sum " + S + " found from index " + result.get(0) + " to " + result.get(1));
            }
        }
    }

