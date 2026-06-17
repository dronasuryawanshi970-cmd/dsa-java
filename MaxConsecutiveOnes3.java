public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int n = nums.length;
        int l = 0;
        int r = 0;
        int zeroes = 0;
        int maxlen = 0;

        while (r < n) {
            if (nums[r] == 0) {
             zeroes++;
            }
         if( zeroes > k ){
            if(nums[l] == 0){
                zeroes--;
            }
            l++;
         }
        
            maxlen =Math.max(maxlen , r - l + 1);
            r++;
        }
          System.out.println(maxlen);
    }
}
