// https://practice.geeksforgeeks.org/problems/implement-atoi/1

package InterviewPrep.Strings;

public class ATOI {
    public static int atoi(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return -1;
            }
            result = result * 10 + (c - '0');
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(atoi(str));  // Outputs: 123
    }
}
