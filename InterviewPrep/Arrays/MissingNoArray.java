//https://practice.geeksforgeeks.org/problems/missing-number-in-array1416/1
package InterviewPrep.Arrays;

public class MissingNoArray {

    public static int missingNumber(int array[], int n) {
        // Your Code Here
        
        int sum=0;
        for (int i = 0; i < n-1; i++) {
            sum+=array[i];
        }
        int digit=n*(n+1)/2;
        int value=digit-sum;
        System.out.println(value);
        return value;
    }
    
    
    public static void main(String[] args) {
        int n=5;
        int array[]={1,2,3,5};

        missingNumber(array, n);
        

    }
}
