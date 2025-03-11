import java.util.Scanner;
public class Operator_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int A = scan.nextInt();
        System.out.print("Enter num2: ");
        int B = scan.nextInt();
        
        // Relational Operators:
        /*
        Relational Operators are used to check for relations like equality,
        greater than, and less than. They return boolean results after the comparison.
        == , Equal to.
        != , Not equal to.
        < , Less than.
        <= , Less than or equal to.
        > , Greater than.
        >= , Greater than or equal to.
        */
        System.out.println("Relational Operators!");
        System.out.println("Is A greater than B: "+ (A>B));
        System.out.println("Is A lesser than B: "+ (A<B));
        System.out.println("Is A greater or equal to B: "+ (A>=B));
        System.out.println("Is A lesser or equal to B: "+ (A<=B));
        System.out.println("Is A equal to B: "+ (A==B));
        System.out.println("Is A not equal to B: "+(A!=B));

        //Logical Operators
        /*
        Logical Operators are used to perform “logical AND” and “logical OR” operations, 
        similar to AND gate and OR gate in digital electronics.
        &&, Logical AND: returns true when both conditions are true.
        ||, Logical OR: returns true if at least one condition is true.
        !, Logical NOT: returns true when a condition is false and vice-versa
         */
        boolean x = true;
        boolean y = false;
        System.out.println();
        System.out.println("Logical operators!");
        System.out.println("AND OP: "+(x&&y));
        System.out.println("OR OP: "+(x||y));
        System.out.println("NOt OP of x: "+ (!x));
        System.out.println("NOT OP of y: "+ (!y));

        //Bitwise Operators
        /*
         * Bitwise Operators are used to perform the manipulation of individual bits of a number and with 
         * any of the integer types. They are used when performing update and query operations of the Binary 
         * indexed trees. 
         * & (Bitwise AND) – returns bit-by-bit AND of input values.
         * | (Bitwise OR) – returns bit-by-bit OR of input values.
         * ^ (Bitwise XOR) – returns bit-by-bit XOR of input values.
         * ~ (Bitwise Complement) – inverts all bits (one’s complement).
         */
        int d = 0b1010;
        int e = 0b1100;
        System.out.println();
        System.out.println("Bitwise Operator!");
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        
        //Shift Operators
        /*
         * Shift Operators are used to shift the bits of a number left or right, thereby multiplying or dividing the 
         * number by two, respectively. They can be used when we have to multiply or divide a number by two
         * << (Left shift) – Shifts bits left, filling 0s (multiplies by a power of two).
         * >> (Signed right shift) – Shifts bits right, filling 0s (divides by a power of two), with the leftmost bit depending on the sign.
         * >>> (Unsigned right shift) – Shifts bits right, filling 0s, with the leftmost bit always 0.
         */
        System.out.println();
        System.out.println("Shift Operators!");
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));
        
        scan.close();//Closing the Scanner class is always important!
    }
}
