public class ContainsDuplicate {
    public static void main(String [] args) {
        int arr[] = {1,2,3,1};
        int n = arr.length;
        boolean ans = false;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(set.contains(arr[i])){
                ans = true;
                break;
            }
            set.add(arr[i]);
        }
        System.out.println(ans);
    }
}
