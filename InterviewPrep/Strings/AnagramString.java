//https://practice.geeksforgeeks.org/problems/anagram-1587115620/1

package InterviewPrep.Strings;

import java.util.Arrays;

public class AnagramString {
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();
        Arrays.sort(aArray);
        Arrays.sort(bArray);
        return Arrays.equals(aArray, bArray);
    }

    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";
        System.out.println(isAnagram(a, b) ? "YES" : "NO");  // Outputs: YES
    }
}
