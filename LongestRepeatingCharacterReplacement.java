public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int n = s.length();
        int left = 0;
        int maxFreq = 0;
        int result = 0;
        int[] freq = new int[26];

        for (int i = 0; i < n; i++) {

            freq[s.charAt(i) - 'A']++;

            // Update maximum frequency
            maxFreq = Math.max(maxFreq, freq[s.charAt(i) - 'A']);

            // Shrink window if replacements needed exceed k
            while ((i - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result,i- left + 1);
        }
System.out.println("Longest repeating character replacement: " + result);
    }
}