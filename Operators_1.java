import java.util.Scanner;
public class Operators_1 {
    public static void main(String[] args){
        //Arithmetic operators
        //Diff Arithmetic operators are: (+ - * / %)
        /*
         * + (Addition)
         * - (Subtraction)
         * * (Multiplication)
         * / (quotient Division)
         * % (Mod-remainder)
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter NUM 1: ");
        int A = scan.nextInt();
        System.out.print("Enter NUM 2: ");
        int B = scan.nextInt();

        int add = A+B;
        int subt = A-B;
        int multip = A*B;
        int div = A/B;
        int mod = A%B;

        System.out.println("A+B= "+add);
        System.out.println("A-B= "+subt);
        System.out.println("A*B= "+multip);
        System.out.println("A/B= "+div);
        System.out.println("A%B= "+mod);

        scan.close();
    }
}

