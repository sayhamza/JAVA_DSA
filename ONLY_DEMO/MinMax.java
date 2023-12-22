// https://www.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1?page=1&difficulty=Basic,Easy&sprint=ca8ae412173dbd8346c26a0295d098fd&sortBy=submissions

public class MinMax {
    
    static class Pair  
{  
    long min;
    long max;  
    public Pair(long min, long max)  
    {  
        this.min = min;  
        this.max = max;  
    }  
} 
    static Pair getMinMax(long[] a, long n)  
    {
        //Write your code here
        long min=a[0];
        long max=a[0];
        for (int i=1;i<n;i++){
             min= Math.min(min,a[i]);
             max= Math.max(max,a[i]);
            
        }
        return new Pair(min, max);
    }

    public static void main(String[] args) {
        long[] a = {3, 2, 1, 56, 10000, 167};
        Pair result = getMinMax(a, a.length);
        System.out.println(result.min + " " + result.max);
    }
}
