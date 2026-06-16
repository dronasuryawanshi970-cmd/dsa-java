public class MajorityElementII {
    public static void main(String[] args) {
        int arr[] = {3,2,3};
        int n = arr.length;
        int count1 = 0;
        int count2 = 0;
        int majority1 = Integer.MIN_VALUE;
        int majority2 = Integer.MIN_VALUE;
for(int i = 0; i<n; i++){ 
    if(arr[i] == majority1){
        count1++;
    }
    else if(arr[i] == majority2){
        count2++;
    }
    else if(count1 == 0){
        majority1 = arr[i];
        count1 = 1;
    }
    else if(count2 == 0){
        majority2 = arr[i];
        count2 = 1;
    }
    else{
        count1--;
        count2--;
    }
System.out.println(majority1);
System.out.println(majority2);
}
    }
}