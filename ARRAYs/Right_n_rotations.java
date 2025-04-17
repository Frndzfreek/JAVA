package ARRAYs;

import java.util.Scanner;

public class Right_n_rotations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size=scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        n = n % size;

        reverse(arr, 0, size - 1);
        reverse(arr, 0, n - 1);
        reverse(arr, n, size - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    
    }
}
