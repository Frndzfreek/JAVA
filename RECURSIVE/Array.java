public class Array {
    public static void Array (int[] a, int index) {
        if (index == a.length) return;  // Base case
        System.out.print(a[index] + " ");
        Array(a, index + 1);  // Recursive case
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Array(a, 0);
    }
}
