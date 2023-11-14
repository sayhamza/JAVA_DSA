// https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1

package InterviewPrep.Arrays;

import java.util.Arrays;

class MinimizeTheHeight2 {
    int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int res = arr[n-1] - arr[0];
        for (int i = 0; i < n-1; i++) {
            int max = Math.max(arr[i] + k, arr[n-1] - k);
            int min = Math.min(arr[0] + k, arr[i+1] - k);
            res = Math.min(res, max - min);
        }
        return res;
    }

    public static void main(String[] args) {
        MinimizeTheHeight2 solution = new MinimizeTheHeight2();
        int[] arr = {1, 5, 8, 10};
        int k = 2;
        int minDiff = solution.getMinDiff(arr, arr.length, k);
        System.out.println(minDiff);
    }
}
