package LOOPS;
import java.util.Scanner;
class MaxOf3Numbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a>b && a>c){
            System.out.println(a+" is the largest of three");
        }else if(b>a && b>c){
            System.out.println(b+" is the largest of three");
        }else{
            System.out.println(c+" is the largest of three");
        }
        scanner.close();
    }
}
