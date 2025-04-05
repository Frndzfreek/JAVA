public class PrimeBtwNum {
    public static void main(String[] args) {
        int start = 10;
        int end = 50;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i*i <=num; i++) {// for (int i = 2; i <= Math.sqrt(num); i++)
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
