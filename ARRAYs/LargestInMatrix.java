package ARRAYs;

public class LargestInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {12, 25, 37},
            {45, 67, 89},
            {30, 56, 99}
        };
        int largest = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element is: " + largest);
    }
}