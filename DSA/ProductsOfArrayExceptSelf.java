public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int arr[] = {-1,1,0,-3,3};
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] * arr[i];
        }
        int suffix[] = new int[n];
        suffix[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * arr[i];
        }
        int result[] = new int[n];
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                result[i] = suffix[i+1];
            } else if(i == n-1) {
                result[i] = prefix[i-1];
            } else {
                result[i] = prefix[i-1] * suffix[i+1];
            }
        }
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
