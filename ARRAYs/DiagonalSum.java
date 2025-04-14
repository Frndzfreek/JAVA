package ARRAYs;
class DiagonalSum{
    public static void main(String[] args){

        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

        int a=0,b=0;//a=primarySum and b=SecondarySum

        for(int i=0;i<matrix.length;i++){
            a+=matrix[i][i];
            b+=matrix[i][matrix.length-1-i];
        }
        System.out.println(a);
        System.out.println(b);
    }
}
