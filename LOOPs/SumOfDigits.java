import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum=0;
        
        while (n>0) {
            int digit = n % 10;
            sum+=digit;
            n/=10;
        }
        System.out.println("Sum of numbers: "+sum);
    }
}
