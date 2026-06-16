import java.util.HashSet;
import java.util.Iterator;
public class HashSetLearning {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        // insertion
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
       
        System.out.println(set);
        // search 
        if(set.contains(1)){
            System.out.println("1 is present in the set");
        }
        if(!set.contains(6)){
            System.out.println("6 is not present in the set");
        }

      //  set.remove(1);
   // if(!set.contains(1)){
     //   System.out.println("1 is removed from the set");}
        System.out.println("size of set is: " + set.size());
        // iteration
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        } 
    }
}
