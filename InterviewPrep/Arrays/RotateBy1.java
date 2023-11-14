// https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1


package InterviewPrep.Arrays;

class RotateBy1 {
    void rotate(int arr[], int n) {
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }

    public static void main(String[] args) {
        RotateBy1 solution = new RotateBy1();
        int[] arr = {1, 2, 3, 4, 5};
        solution.rotate(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
