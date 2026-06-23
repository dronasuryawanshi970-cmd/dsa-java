class Solution {
    public String removeOuterParentheses(String s) {
         StringBuilder sb = new StringBuilder();
        int balance = 0;
int n = s.length();
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '('){
                if(balance > 0 ){
                    sb.append('(');
                }
                balance++;
            }
            else{
                balance--;
                if(balance>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}