package MyPractise.Arrays;

public class maxsubarraywithindex {
    public static int[] maxSubarraySum(int[] arr) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        int start = 0; // Initialize the starting index of the max subarray
        int end = 0;   // Initialize the ending index of the max subarray
        int tempStart = 0; // Temporary starting index for the current subarray
    
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
    
            if (cs < 0) {
                cs = 0;
                tempStart = i + 1; // Update the temporary starting index
            }
    
            if (cs > ms) {
                ms = cs;
                start = tempStart; // Update the starting index of the max subarray
                end = i;          // Update the ending index of the max subarray
            }
        }
    
        // Return an array containing the starting and ending indices of the max subarray sum
        return new int[]{start, end};
    }
    
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] maxIndices = maxSubarraySum(numbers);
        int max = maxIndices[0];
        int min = maxIndices[1];
        System.out.println("Maximum subarray sum: " + max);
        System.out.println("Start index: " + max);
        System.out.println("End index: " + min);
    }
    
}
