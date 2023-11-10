// https://practice.geeksforgeeks.org/problems/remove-duplicates3034/1

package InterviewPrep.Strings;

public class RemoveDuplicates {
    public static String removeDups(String S) {
        boolean[] seen = new boolean[256];
        StringBuilder builder = new StringBuilder();

        for (char ch : S.toCharArray()) {
            if (!seen[ch]) {
                seen[ch] = true;
                builder.append(ch);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        String S ="zvvo";
        System.out.println(removeDups(S));  // Outputs: zvo
    }
}
