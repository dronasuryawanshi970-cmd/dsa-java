import java.util.*;
public class MaximumVowelsInASubstring {
    public static void main(String [] args) {
        String s = "abciiidef";
        int k = 3;
        int maxvowels = 0;
        int windowvowels = 0;
        int  n = s.length();
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');   
        set.add('i');
        set.add('o');
        set.add('u');
        for(int i = 0; i < k; i++){
            if(set.contains(s.charAt(i))){
                windowvowels++;
            }
        }
            maxvowels = windowvowels;
        for(int i = k; i < n; i++){
            if(set.contains(s.charAt(i - k))){
                windowvowels--;
            }
                if(set.contains(s.charAt(i))){
                    windowvowels++;
                }
            maxvowels = Math.max(maxvowels, windowvowels);
        }
        System.out.println(maxvowels);
    }
}