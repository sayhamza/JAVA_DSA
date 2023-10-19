//https://practice.geeksforgeeks.org/problems/minimum-platforms-1587115620/1


package InterviewPrep.Arrays;

import java.util.Arrays;

public class MinimumPlatforms {
        public static int findPlatform(int arr[], int dep[], int n){
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=0;
        int j=0;
        int count=0;
        int plat=0;
        
       while(i<n && j<n){
          if(arr[i]<=dep[j]){
              plat++;
              i++;
          } else{
              plat--;
              j++;
          }
          count=Math.max(count,plat);
          
       }
        
        return count;
    }

    public static void main(String[] args) {
        int n=6;
        int arr[]={900,940,950,1100,1500,1800};
        int dep[]={910, 1200, 1120, 1130, 1900, 2000};
        findPlatform(arr, dep, n);
    }
}

    

