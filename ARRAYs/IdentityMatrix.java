package ARRAYs;

import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int[][] matrix=new int[row][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                matrix[i][j]=scan.nextInt();
            }
        }
        
        boolean iden=true;//or String iden="yes";
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j && matrix[i][j]!=1){
                    iden=false;
                }else if(i!=j && matrix[i][j]==1){
                    iden=false;
                }
            }
        }
        System.out.println(iden);
        scan.close();
    }
}
