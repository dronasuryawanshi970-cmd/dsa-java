class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        int i = n-1;
        while(i>=0){
            int ch = num.charAt(i) ;
            if(ch % 2 == 1){
                return num.substring(0, i+1);
            }
            i--;
        }
        return "";
    }
}