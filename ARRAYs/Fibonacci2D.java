package ARRAYs;

public class Fibonacci2D {
    public static void main(String[] args) {
        int n = 5;
        int[][] fib = new int[n][n];
        for (int i = 0; i < n; i++) {
            fib[i][0] = 1;
            fib[i][1] = 1;
        }
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < n; j++) {
                fib[i][j] = fib[i - 1][j - 1] + fib[i - 2][j - 2];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(fib[i][j] + " ");
            }
            System.out.println();
        }
    }
}
