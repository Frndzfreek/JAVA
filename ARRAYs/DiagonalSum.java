class DiagonalSum{
    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int primaryS=0,SecondaryS=0;
        for(int i=0;i<matrix.length;i++){
            a+=matrix[i][i];
            b+=matrix[i][matrix.length-1-i];
        }
        System.out.println(a);
        System.out.println(b);
    }
}
