//https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string/0
package InterviewPrep.Strings;

public class LongestPalindromeSubString {

        static String longestPalin(String S) {
            int n = S.length();
            boolean table[][] = new boolean[n][n];
            int maxLength = 1;
            for (int i = 0; i < n; ++i)
                table[i][i] = true;
            int start = 0;
            for (int i = 0; i < n - 1; ++i) {
                if (S.charAt(i) == S.charAt(i + 1)) {
                    table[i][i + 1] = true;
                    start = i;
                    maxLength = 2;
                }
            }
            for (int k = 3; k <= n; ++k) {
                for (int i = 0; i < n - k + 1; ++i) {
                    int j = i + k - 1;
                    if (table[i + 1][j - 1] && S.charAt(i) == S.charAt(j)) {
                        table[i][j] = true;
                        if (k > maxLength) {
                            start = i;
                            maxLength = k;
                        }
                    }
                }
            }
            return S.substring(start, start + maxLength);
        }
    
        public static void main(String[] args) {
            String S = "aaaabbaa";
            System.out.println(longestPalin(S));  // Outputs: aabbaa
        }
    }

