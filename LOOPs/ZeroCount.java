import java.util.Scanner;

public class ZeroCount{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int count=0;
        
        while (n>0) {
            int digit = n % 10;
            if (digit == 0) {
                count++;
            }
            n/=10;
        }
        System.out.println("Number of zeros in = " + count);

        scan.close();
    }
}
