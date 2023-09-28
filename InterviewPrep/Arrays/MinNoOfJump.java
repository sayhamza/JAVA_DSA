//Q) https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&difficulty[]=0&difficulty[]=1&sortBy=submissions

package InterviewPrep.Arrays;

public class MinNoOfJump {

    public static int minJumps(int[] arr){
        // your code here
        int n = arr.length;
        if (n == 0) {
            return 0;
        }

        if (arr[0] == 0) {
            return -1;
        }

        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return jumps;
            }

            maxReach = Math.max(maxReach, i + arr[i]);

            steps--;

            if (steps == 0) {
                jumps++;

                if (i >= maxReach) {
                    return -1;
                }

                steps = maxReach - i;
            }
        }

        return -1;

        
    }
    public static void main(String[] args) {
       
       int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; 
       int result= minJumps(arr);
       System.out.println(result);
    }
    
}
