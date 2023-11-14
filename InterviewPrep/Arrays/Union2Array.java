// https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1

package InterviewPrep.Arrays;
import java.util.HashSet;

class Union2Array {
    int doUnion(int a[], int n, int b[], int m) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < m; i++) {
            set.add(b[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        Union2Array solution = new Union2Array();
        int[] a = {85, 25, 1, 32, 54, 6};
        int[] b = {85, 2};
        int unionSize = solution.doUnion(a, a.length, b, b.length);
        System.out.println(unionSize);
    }
}

    

