package ARRAYs;

class Matrix{
    public int[][] addMatrices(int[][] matrix1, int[][] matrix2, int N) {
       int[][] result=new int[N][N];
       for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
               result[i][j]=matrix1[i][j]+matrix2[i][j];
           }
       }return result;
    }

    public int[][] subtractMatrices(int[][] matrix1, int[][] matrix2, int N) {
       int[][] result=new int[N][N];
       for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
               result[i][j]=matrix1[i][j]-matrix2[i][j];
           }
       }return result;
    }

    public int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2, int N) {
       int[][] result=new int[N][N];
       for(int i=0;i<N;i++){
           for(int j=0;j<N;j++){
               for(int k=0;k<N;k++){
                result[i][j]+=matrix1[i][k]*matrix2[k][j];
               }
           }
       }return result;
    }
    public void printMatrix(int[][] matrix, int N) {
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(matrix[i][j]+" ");
            }
        }System.out.println();
    }
}