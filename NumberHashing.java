import java.util.*;

public class NumberHashing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int q = sc.nextInt();

        while(q-- > 0) {

            int number = sc.nextInt();

            // Fetch frequency
            System.out.println(map.getOrDefault(number, 0));
        }

        sc.close();
    }
}