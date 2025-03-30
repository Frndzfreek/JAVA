package EXCEPTIONS;

import java.util.Scanner;
class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}
class AgeExceptions{
    public static void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException("Age must be 18 or older.");
        }else{
            System.out.println("Age is valid");
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        try{
            checkAge(a);
        }catch(AgeException e){
            System.out.println(e.getMessage());
        }
        scan.close();
    }
}