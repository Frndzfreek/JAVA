
package EXCEPTIONS;

import java.util.*;
class WithdrawalException extends Exception{
    public WithdrawalException(String message){
        super(message);
    }
}
class AccountStatusException extends Exception{
    public AccountStatusException(String message){
        super(message);
    }
}
class Bank{
    double balance;
    boolean premium;
    int transaction;
    double bonus;
    
    public Bank(double balance,boolean premium,int transaction,double bonus){
        this.balance=balance;
        this.premium=premium;
        this.transaction=transaction;
        this.bonus=bonus;
    }
    public void ValidateBonus() throws WithdrawalException{
        if(bonus<0){
            throw new WithdrawalException("Bonus amount cannot be negative.");
        }
    }
    public void ValidateAccountStatus() throws AccountStatusException{
        if(premium&&transaction<3){
            throw new AccountStatusException("User is not eligible for bonus rewards.");
        }
    }
    public void withdraw(double amount) throws WithdrawalException{
        double feeRate=premium ? 0.01 : 0.02;
        double fee =amount>50.00 ? amount*feeRate : 0;
        double totalAmount=amount+fee;
        if(totalAmount>balance){
            throw new WithdrawalException("Insufficient balance.");
        }
        balance-=totalAmount;
    }
    public void printAccountDetails(){
        System.out.println(balance);
        System.out.println(bonus);
    }
}
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        double balance=scan.nextDouble();
        boolean premium=scan.nextBoolean();
        int transaction = scan.nextInt();
        double bonus=scan.nextDouble();//neg
        double withdrawal=scan.nextDouble();
        try{
            Bank obj=new Bank(balance,premium,transaction,bonus);
            obj.ValidateBonus();
            obj.ValidateAccountStatus();
            obj.withdraw(withdrawal);
            obj.printAccountDetails();
        }
        catch(WithdrawalException | AccountStatusException e){
            System.out.println(e.getMessage());
        }
        scan.close();
    }
}