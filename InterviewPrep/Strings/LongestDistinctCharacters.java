// https://practice.geeksforgeeks.org/problems/longest-distinct-characters-in-string5848/1

package InterviewPrep.Strings;

import java.util.HashMap;
 
public class LongestDistinctCharacters {
    public static int longestDistinct(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0, max = 0;

        while (right < s.length()) {
            if (map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            max = Math.max(max, right - left + 1);
            right++;
        }

        return max;
    }

    public static void main(String[] args) {
        String S = "geeksforgeeks";
        System.out.println(longestDistinct(S));  // Outputs: 7
    }
}
