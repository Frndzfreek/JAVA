import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int rows=scan.nextInt();
        for(int i=0;i<=rows;i++){
            for (int k = 0; k<rows - i; k++) {
                System.out.print(" ");
            }
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
