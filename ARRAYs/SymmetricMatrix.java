package ARRAYS;

public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {2, 1, 4},
            {3, 4, 1}
        };
        boolean isSymmetric = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }
        System.out.println("Matrix is symmetric: " + isSymmetric);
    }
}
