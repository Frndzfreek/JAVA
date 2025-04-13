import java.util.*;

public class Main {
    public static int mostFrequent(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFreq = 0, mostFrequent = arr[0];

        for (int num : arr) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);

            if (freq > maxFreq) {
                maxFreq = freq;
                mostFrequent = num;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 5};

        System.out.println(mostFrequent(arr)); 
    }
}
