class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        int n = sentence.length();
        for(int i = 0; i<n; i++){
        char ch = sentence.charAt(i);
        set.add(ch);
        }
        return set.size() == 26;
    }
}