public class Array {
    public static void Arrays (int[] a, int index) {
        if (index == a.length) return;  // Base case
        System.out.print(a[index] + " ");
        Arrays(a, index + 1);  // Recursive case
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Arrays(a, 0);
    }
}
