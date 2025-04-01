public class Power {
    public static int power(int a, int b) {
        if (b == 0) return 1;  // Base case
        return a * power(a, b - 1);  // Recursive case
    }

    public static void main(String[] args) {
        int base = 2, exponent = 5;
        System.out.println(base + "^" + exponent + " = " + power(base, exponent));
    }
}
