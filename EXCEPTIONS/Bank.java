package EXCEPTIONS;

import java.util.Scanner;
class Bank {
    private String name;
    private int accno;
    private double bal;
    // Bank(String name,int accno,double bal){
    //     this.name=name;
    //     this.accno=accno;
    //     this.bal=bal;
    // }
    public int getAccno(){
        return accno;
    }
    public void setAccno(int accno){
        this.accno=accno;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getBal(){
        return bal;
    }
    public void setBal(double bal){
        this.bal=bal;
    }
    public String toString(){
        return accno+" "+name+" "+bal;
    }
}
class BankBO {
    public void validate(Bank b) throws InvalidBalanceException{
        if(b.getBal()<1000){
            throw new InvalidBalanceException("Balance is less than 1000");
        }
    }
}
class InvalidBalanceException extends Exception {
    public InvalidBalanceException(String message){
        System.out.println(message);
    }
}

class Main {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	Bank b = new Bank();
	b.setAccno(Integer.parseInt(sc.nextLine()));
	b.setName(sc.nextLine());
	b.setBal(Double.parseDouble(sc.nextLine()));
	BankBO bbo = new BankBO();
        try {
            bbo.validate(b);
            System.out.println(b);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        sc.close();
    }  
}