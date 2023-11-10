//https://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string5459/1

package InterviewPrep.Strings;

public class ReverseWords {

    public static String reverseWords(String S) {
        // Split the string into words
        String[] words = S.split("\\.");

        // Reverse the array of words
        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }

        // Join the words back together
        return String.join(".", words);
    }

    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));  // Outputs: much.very.program.this.like.i
    }
}
