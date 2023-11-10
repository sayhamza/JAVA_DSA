// https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1

package InterviewPrep.Strings;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static String commonPrefix(String[] arr, int n) {
        if (n == 0) return "-1";
        if (n == 1) return arr[0];

        Arrays.sort(arr);
        int end = Math.min(arr[0].length(), arr[n - 1].length());

        int i = 0;
        while (i < end && arr[0].charAt(i) == arr[n - 1].charAt(i)) i++;

        String pre = arr[0].substring(0, i);
        return pre.length() > 0 ? pre : "-1";
    }

    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println(commonPrefix(arr, arr.length));  // Outputs: gee
    }
}

