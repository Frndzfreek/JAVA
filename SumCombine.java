import java.util.*;

public class Main {
    public static void findPairs(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            map.put(num, 1); 
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 1};
        findPairs(arr, 9);

        // Output:
        // (2, 7)
        // (4, 5)
        // (8, 1)
    }
}
