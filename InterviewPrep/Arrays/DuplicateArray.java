//https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&difficulty[]=0&difficulty[]=1&sortBy=submissions

package InterviewPrep.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
         HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()>1){
                ans.add(entry.getKey());
            }
        }
        if(ans.size()==0){
            ans.add(-1);
            System.out.println(ans);
            return ans;
        }
        Collections.sort(ans);
        System.out.println(ans);
        return ans;
        
    }
    public static void main(String[] args) {
        int n =5;
        int arr[]={2,3,1,2,3};
        duplicates(arr, n);
    }
    
}
