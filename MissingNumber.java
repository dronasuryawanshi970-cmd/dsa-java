class MissingNumber {
    public static void main (String [] args){
        int arr [] = {3,0,1,7,8,5,4,6};
        int n = arr.length;
        int Arraysum = 0;
        for(int i = 0; i<n; i++){
            Arraysum += arr[i];
        }
        int RangeSum = 0;
        for(int i = 0; i<=n; i++){
            RangeSum += i;
        }
        System.out.print(RangeSum - Arraysum);
    }
}