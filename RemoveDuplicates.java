import java.util.HashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>(); // Stores unique elements

        for (int num : arr) {
            set.add(num); // HashSet automatically ignores duplicates
        }

        // Convert HashSet to array
        int[] uniqueArray = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArray[i++] = num;
        }
        return uniqueArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 2, 4, 7}; // Example input with duplicates

        int[] uniqueArr = removeDuplicates(arr);

        // Print unique elements
        System.out.print("Array after removing duplicates: ");
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}
