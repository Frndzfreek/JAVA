class Main{
    public static void main(String[] args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        String iden="Yes";//or boolean iden=true;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j && matrix[i][j]!=1){
                    iden="No";
                }else if(i!=j && matrix[i][j]==1){
                    iden="No";
                }
            }
        }
        System.out.println("is identity matrix: "+iden);
    }
}
