public class LongestSubarray {
    public static void main(String [] args) {
        int [] arr = {2,5,1,10,10};
        int n = arr.length;
        int k = 14;
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxlen = 0;
        while(r<n){
            sum = sum + arr[r];
              while(sum>k){
            sum = sum - arr[l];
            l = l + 1;
        }
            maxlen = Math.max(maxlen , r-l+1);
            r = r + 1;
    }
        System.out.println(maxlen);
    }
}
