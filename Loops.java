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
        System.out.println("If-else Loop");
        System.out.print("Enter a number: ");
        int A = scan.nextInt();
        if (A%2!=0){
            System.out.print("Odd number");
        }else{
            System.out.print("Even number");
        }
        scan.close();

        //For Loop Syntax
        /*
        for (initialization-with data_type; condition; Increment/Decrement) {
            //Code to be executed
        }
        */
        
        //Printing first 10 natural numbers
        System.out.println();
        System.out.println("For-Loop");
        for (int i = 1;i<=10;i++){
            System.out.print(i);
        }

        //While Loop Syntax
        /*
        intialization
         while (condition) {
            // Code to be executed
            increment/decrement condition
        }
        */

        //Printing first 10 natural numbers
        System.out.println();
        System.out.println("While Loop");
        int j = 1;
        while(j<=10){
            System.out.println(j);
            j++;
        }

        //Do-While Loop Syntax
        /*
        intialization
        do {
            // Code to be executed
            increment/decrement condition
        } while (condition);
        */

        //Printing first 10 natural numbers
        System.out.println();
        System.out.println("Do-While Loop");
        int k = 1;
        do{
            System.out.println(k);
            k++;
        }while(k<=10);

        //For-each Loop Syntax
        /*
        for (type element : array/collection) {
            // Code to be executed
        }
        */
        //Code to read through an array
        System.out.println();
        System.out.println("For-Each Loop");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) { //It is read as {for each number such that numbers...}
            System.out.println(number);
        }    
    }
}