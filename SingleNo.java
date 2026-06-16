class SingleNo {
    public static void main(String[] args) {
        int arr[] = {2,2,1}; // Change this value to print more or fewer numbers
      int n = arr.length;
        int result = 0;
        for(int i = 0; i<n; i++){
            result = result ^ arr[i];
        }
        System.out.print(result);
    }
}