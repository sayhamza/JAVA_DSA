//TC O(n)

package Arrays;

public class LinearSearch {
    public static int lsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;

            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int numbers[] = { 1, 4, 3, 2, 5, 6 };
        int key = 89;
        int index = lsearch(numbers, key);
        if (index == -1) {
            System.out.println("Key is Unavailable");

        } else {
            System.out.println("Key is at Index:" + index);
        }

    }

}
