package ARRAYs;
public class EvenIndexSum {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30};
        int sum = 0;

        for (int i = 0; i < arr.length; i += 2) {
            sum += arr[i];
        }

        System.out.println("Sum of elements at even indexes: " + sum);
    }
}
