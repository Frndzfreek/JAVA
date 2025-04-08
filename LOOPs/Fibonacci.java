import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of Terms: ");
        int n=scan.nextInt();
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}
