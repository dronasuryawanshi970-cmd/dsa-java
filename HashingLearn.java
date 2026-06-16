import java.util.*;
public class HashingLearn{
public static void main(String[] args){
    HashMap<String , Integer> map = new HashMap<>();
    // insertion
     map.put("India" , 30);
     map.put("USA" , 20);
     map.put("China", 40);
     System.out.println(map); 
     // search
     if(map.containsKey("India")){
        System.out.println("India is present in the map");
     }
     else{
        System.out.println("India is not present in the map");
     }
     System.out.println(map.get("USA")); // 20
     System.out.println(map.get("Russia")); // null

 //    int arr[] = {1, 2, 3, 4, 5};
   //  for(int i = 0; i < 5; i++){
     //   System.out.print(arr[i] + " ");
     //}
     //System.out.println();
     //for(int val : arr){
       // System.out.print(val + " ");
     //}
     //System.out.println();
     for(Map.Entry<String , Integer> e : map.entrySet()){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
     }
}
}