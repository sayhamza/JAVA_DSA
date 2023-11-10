// https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1

package InterviewPrep.StackAndQueue;

import java.util.Stack;

public class ParanthesisChecker {
    public static boolean isBalanced(String x) {
        Stack<Character> stack = new Stack<>();
        for (char ch : x.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "{([])}";
        System.out.println(isBalanced(expr) ? "balanced" : "not balanced");  // Outputs: balanced
    }
}
