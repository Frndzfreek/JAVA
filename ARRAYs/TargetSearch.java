package ARRAYs;

import java.util.Scanner;
class TargetSearch{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.print("Enter target: ");
        int target=scan.nextInt();
        
        boolean found=false;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(target==matrix[i][j]){
                    System.out.println("element was found in index "+"("+i+","+j+")");
                    found=true;
                }
            }
        }
        if(found!=true){
            System.out.println("Element not found");
        }
        scan.close();
    }
}
