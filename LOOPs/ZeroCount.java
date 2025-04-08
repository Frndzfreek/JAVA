import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int count=0;
        
        while (n>0) {
            int digit = n % 10;
            if (digit == 0) {
                count++;
            }
            n/=10;
        }
        System.out.println("Number of zeros in = " + count);
    }
}
