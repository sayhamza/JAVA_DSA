// package COMPLETECODE.ALL.Hashing;

// import java.util.HashMap;

// public class ItineraryTickets {

//     public static String getStart(HashMap<String,String> tickets){
//         HashMap<String,String> revHashmap =new HashMap<>();

//         for (String key : tickets.keySet()) {
//             revHashmap.put(tickets.get(key), key);
//         }

//         for (String key : tickets.keySet()) {
//             if (!revHashmap.containsKey(key)) {
//                 return key; //Starting Point
//             }
//         }

//         return null;
//     }
//     public static void main(String[] args) {

//         HashMap<String,String> tickets=new HashMap<>();

//         tickets.put("Chennai", "Bengaluru");
//         tickets.put("Mumbai", "Delhi");
//         tickets.put("Goa", "Chennai");
//         tickets.put("Delhi", "Goa");

//         String start =getStart(tickets);
//         System.out.print(start);
//         for (String key : tickets.keySet()){
//             System.out.println("-->"+tickets.get(start));
//             start=tickets.get(start);
//         }
//         System.out.println();
//     }
// }
