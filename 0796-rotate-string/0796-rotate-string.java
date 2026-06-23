class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String twice = s + s;
        return twice.contains(goal);
    }
}  



//or we can also write 
//  if(s.length() != goal.length())   return false;
// if((s+s).contains(goal)) return true;
// return false;