public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        int n = arr.length;
        int count = 0;
        int majority = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] == majority){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                majority = arr[i];
                count = 1;
            }
        }
        System.out.println(majority);
    }
}
