// https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/1?page=1&difficulty=Basic,Easy&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions

public class Search {
    public static int findElement(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 2, 3, 4};
        int x = 3;
        int result = findElement(arr, n, x);
        System.out.println(result);
    }
}