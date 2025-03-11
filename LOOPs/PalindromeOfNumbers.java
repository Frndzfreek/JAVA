package LOOPS;

class PalindromeOfNumbers {
    public static void main(String[] args){
        int n = 45657;

        int original=n, r=0;
        while(n!=0){
            r = r*10 + n % 10;//includes the last digit one by one
            n=n/10;//Deletes all the last digit one by one
        }
        if(original==r){
            System.out.println(original+" is a palindrome");
        }else{
            System.out.println(original+" is not a palindrome");
        }
    }
}
