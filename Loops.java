import java.util.Scanner;
public class Loops{
    public static void main(String[] args){
        //LOOPS IN JAVA
        //If-Else loop,For loop,While loop,Do-while loop

        //If-Else Syntax:
        /*
        if (condition1) {
        (Executed when condition1 is true)
        } else if (condition2) {
        (executed when condition2 is true)
        } else {
        (executed when condition1 and condition2 turns out false)
        }
        */

        //To check entered number is odd or even
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int A = scan.nextInt();
        if (A%2!=0){
            System.out.print("Odd number");
        }else{
            System.out.print("Even number");
        }
        scan.close();
    }
}