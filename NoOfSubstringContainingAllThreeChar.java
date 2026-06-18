public class NoOfSubstringContainingAllThreeChar {
    public static void main(String [] args) {
        String str = "bbacba";
        int n = str.length();
   int left = 0;
   int result = 0;
   int freq[] = new int[3];
   for(int i = 0; i<n; i++){
    freq[str.charAt(i) - 'a']++;
    while(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
        result += n - i;
        freq[str.charAt(left) - 'a']--;
        left++;
    }
   
   }
    System.out.println(result);
}
}
