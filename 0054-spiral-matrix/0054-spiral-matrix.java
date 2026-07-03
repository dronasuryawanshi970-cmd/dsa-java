import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0;
        int bottom = n - 1;
        int l = 0;
        int r = m - 1;

        while (top <= bottom && l <= r) {


            for (int i = l; i <= r; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

     
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][r]);
            }
            r--;

            if (top <= bottom) {
                for (int i = r; i >= l; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

        
            if (l <= r) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][l]);
                }
                l++;
            }
        }

        return ans; 
    }
}