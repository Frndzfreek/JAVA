package LOOPS;
import java.util.*;

class Clock {
    public void rotate(int row, int col, int[][] matrix, int n) {
        // Base class method (optional implementation)
    }
}

class Clockwise extends Clock {
    @Override
    public void rotate(int row, int col, int[][] matrix, int n) {
        for (int k = 0; k < n; k++) {
            int[][] temp = new int[col][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    temp[j][row - 1 - i] = matrix[i][j];
                }
            }
            matrix = temp;
            row = matrix.length;
            col = matrix[0].length;
        }
    }
}

class Anticlockwise extends Clock {
    @Override
    public void rotate(int row, int col, int[][] matrix, int n) {
        for (int k = 0; k < n; k++) {
            int[][] temp = new int[col][row];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    temp[col - 1 - j][i] = matrix[i][j];
                }
            }
            matrix = temp;
            row = matrix.length;
            col = matrix[0].length;
        }
    }
    
    public void rotation(int l, int m, int Row, int Col, int[][] matrix) {
        int prev, curr;
        prev = matrix[l + 1][m];
        
        for (int i = m; i <= Col; i++) {
            curr = matrix[l][i];
            matrix[l][i] = prev;
            prev = curr;
        }
        l++;

        for (int i = l; i <= Row; i++) {
            curr = matrix[i][Col];
            matrix[i][Col] = prev;
            prev = curr;
        }
        Col--;

        if (l <= Row) {
            for (int i = Col; i >= m; i--) {
                curr = matrix[Row][i];
                matrix[Row][i] = prev;
                prev = curr;
            }
        }
        Row--;

        if (m <= Col) {
            for (int i = Row; i >= l; i--) {
                curr = matrix[i][m];
                matrix[i][m] = prev;
                prev = curr;
            }
        }
        m++;
    }
}

public class ClockRotation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] a = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = s.nextInt();
            }
        }
        
        int n = s.nextInt();
        
        Clockwise cc = new Clockwise();
        Anticlockwise ac = new Anticlockwise();
        
        cc.rotate(row, col, a, n);
        System.out.println("Clockwise ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        
        int[][] b = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.arraycopy(a[i], 0, b[i], 0, col);
        }

        int l = 0, m = 0, Row = row - 1, Col = col - 1;
        while (l < Row && m < Col) {
            int rot = 2 * (Row - l) + 2 * (Col - m);
            int f = n % rot;
            for (int i = 1; i <= f; i++) {
                ac.rotate(row, col, b, n);
                ac.rotation(l, m, Row, Col, b);
            }
            l++;
            m++;
            Row--;
            Col--;
        }
        
        System.out.println("Anti clockwise ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        
        s.close();
    }
}
