//import java.util.Scanner;
public class Problems {
    public static void main(String[] args){
        // int i =10;
        // while(i>0){
        //     System.out.println(i);
        //     i--;
        // }
        // System.out.println("Blast Off!!");

        // Scanner scanner=new Scanner(System.in);
        // int correct=10;
        // int guess;
        // do{
        //     guess=scanner.nextInt();
        //     if(guess>correct){
        //         System.out.println("high");
        //     }else if(guess<correct){
        //         System.out.println("low");
        //     }else{
        //         System.out.println("correct");
        //     }
        // }while(guess!=correct);
        // scanner.close();

    //     int num = 2;
    //     while (num <= 50) {
    //         if (isPrime(num)) {
    //             System.out.print(num + " ");
    //         }
    //         num++;
    //     }
    // }
    // // Method to check if a number is prime
    // public static boolean isPrime(int n) {
    //     if (n < 2) return false; // 0 and 1 are not prime
    //     int i = 2;
    //     while (i * i <= n) { // Check divisibility up to sqrt(n)
    //         if (n % i == 0) {
    //             return false; // Not prime if divisible by any number other than 1 and itself
    //         }
    //         i++;
    //     }
    //     return true;
        
        //Factorial
        // int num=5;
        // long factorial=1;
        // int i = num;
        // while(i>1){
        //     factorial*=i;
        //     i--;
        //     System.out.println(i+1);
        // }
        // System.out.println(factorial);

        //fibbonaci
        // int n = 89;
        // int a=0,b=1,count=0;
        // do{
        //     System.out.print(a+" ");
        //     int c=a+b;
        //     a=b;
        //     b=c;
        //     count++;
        // }while(count<n);

        //sum
        int num=2;
        int sum=0;
        while(num<=100){
            sum+=num;
            num+=2;
        }
        System.out.println(sum);

    }
}
