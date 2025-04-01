import java.util.Arrays;
public class RemoveDuplicatesUsingSorting {
    public static int[] removeDuplicates(int[] arr) {
         // Sort the array first
        Arrays.sort(arr); 
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        return Arrays.copyOf(temp, j);
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 5, 2, 3, 1};
        int[] uniqueArr = removeDuplicates(arr);

        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
    }
}
