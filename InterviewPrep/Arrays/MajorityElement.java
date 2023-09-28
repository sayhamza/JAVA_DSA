//Q)https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&difficulty[]=0&difficulty[]=1&sortBy=submissions

package InterviewPrep.Arrays;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majele(int arr[],int size){
        int N=size/2;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr) {
            if (!map.containsKey(i)) 
                map.put(i, 1);
                else
                map.put(i,map.get(i)+1);   
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()>N) {
                return entry.getKey();
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int size=5;
        int arr[]={3,1,3,3,2};
    }
    
}
