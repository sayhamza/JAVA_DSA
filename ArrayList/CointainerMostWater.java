// package ArrayList;

// import java.util.ArrayList;

// public class CointainerMostWater {

//     public static int (ArrayList<Integer> height){
//         int maxwater=0;
//         int lp=0;
//         int rp=height.size()-1;

//         while (lp<rp) {
//             //Water Area
//             int ht = Math.min(height.get(lp),height.get(rp));
//             int width = rp-lp;
//             int currwater=ht*width;
//             maxwater=Math.max(maxwater, currwater);

//             //Update Pointer
//             if (height.get(lp)<height.get(rp)) {
//                 lp++;
//             }
//             else{
//                 rp--;
//             }

            
//         }
//         return maxwater;

//     }



//     public static void main(String[] args) {
//         ArrayList <Integer> height =new ArrayList<>();
//         height.add();
//         System.out.println(storewater(height));
//     }
    
// }
