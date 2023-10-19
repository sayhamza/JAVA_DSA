
//https://practice.geeksforgeeks.org/problems/pythagorean-triplet3018/1

package InterviewPrep.Arrays;

import java.util.Arrays;

public class PythagoreanTriplet {

    public static boolean checkTriplet(int a[], int n) {
            // code here
            for(int i=0;i<n;i++)a[i]*=a[i];
            Arrays.sort(a);
            for(int i=n-1;i>=2;i--)
            {
                int l=0,h=i-1;
                while(l<h)
                {
                    if((a[h]+a[l]) < a[i] )
                    {
                        l++;
                    }
                    else if(( a[h]+a[l])  > a[i])h--;
                    else return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        int a[]={3,2,4,6,5};
        int n=5;
        checkTriplet(a, n);
    }
}
