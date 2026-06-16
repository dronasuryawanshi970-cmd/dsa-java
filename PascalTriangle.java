public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5; // Number of rows in Pascal's Triangle
        printPascalTriangle(n);
    }

    public static void printPascalTriangle(int n) {
        for (int i = 0; i < n; i++) {
            int number = 1; // First number in each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Calculate the next number in the row
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
