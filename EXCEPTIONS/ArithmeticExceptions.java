package EXCEPTIONS;

// public class Division{
//     public static void main(String[] args){
//         try{
//             int r=10/0;
//             System.out.println(r);
//         }catch(ArithmeticException e){
//             System.out.println("Error: "+e.getMessage());
//         }finally{
//             System.out.println("Gud");
//         }
//     }
// }

//OR

import java.util.Scanner;
class Main{
    public static void divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Cant divide by zero.");
        }
        System.out.println(a/b);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        try{
            divide(a,b);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        scan.close();
    }
}