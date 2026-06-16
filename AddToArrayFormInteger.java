public class AddToArrayFormInteger {
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;
        int[] result = addToArrayForm(num, k);
        System.out.print("Result: ");
        for (int digit : result) {
            System.out.print(digit + " ");
        }
    }

    public static int[] addToArrayForm(int[] num, int k) {
        int n = num.length;
        int carry = k;
        int[] result = new int[n + 10]; // Extra space for carry
        int index = n;

        for (int i = n - 1; i >= 0 || carry > 0; i--) {
            if (i >= 0) {
                carry += num[i];
            }
            result[index--] = carry % 10;
            carry /= 10;
        }

        // Find the starting index of the result
        while (index < result.length && result[index] == 0) {
            index++;
        }

        // Create the final result array
        int[] finalResult = new int[result.length - index];
        for (int i = 0; i < finalResult.length; i++) {
            finalResult[i] = result[index + i];
        }

        return finalResult;
    }
}
