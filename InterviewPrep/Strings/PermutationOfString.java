//https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string/0
package InterviewPrep.Strings;
import java.util.*;

public class PermutationOfString {

    public static Set<String> set = new TreeSet<>();

    public static void permute(String str, int l, int r) {
        if (l == r)
            set.add(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n - 1);
        for (String s : set) {
            System.out.println(s);
        }
    }
}

// public List<String> find_permutation(String S) {
//         // Code here
//         ArrayList<String> ans = new ArrayList<>();
//         return helper("",S,ans);
//     }
    
//     static ArrayList<String> helper(String p,String up,ArrayList<String> ans){
        
//         if(up.isEmpty()){
//             if(!ans.contains(p)){
//             ans.add(0,p);}
//             return ans;
//         }
        
//         char ch=up.charAt(0);
        
//         for(int i=0;i<=p.length();i++){
            
           
//              String second=p.substring(i,p.length());
//              String first=p.substring(0,i);
            
//             helper(first+ch+second,up.substring(1),ans);
//         }
//         Collections.sort(ans);
//         return ans;
//     }