package EXCEPTIONS;

import java.util.Scanner;
class DotException extends Exception{
    public DotException(String message){
        super(message);
    }
}
class AtTheRateException extends Exception{
    public AtTheRateException(String message){
        super(message);
    }
}
class DomainException extends Exception{
    public DomainException(String message){
        super(message);
    }
}
class Main{
    public static void validateEmail(String email) throws DotException, AtTheRateException, DomainException{
        if(!email.contains("@")){
            throw new AtTheRateException("AtTheRateException: Invalid @ usage");
        }
        if(!email.contains(".")){
            throw new DotException("DotException: Invalid Dot usage");
        }
        
        String[] parts=email.split("@");
        
        if(parts.length!=2 || !parts[1].contains(".")|| parts[1].isEmpty()){
            throw new DomainException("DomainException: Invalid Domain");
        }
        String domain=parts[1].substring(parts[1].lastIndexOf('.')+1);
        
        if(!(domain.equals("in")||domain.equals("com")||domain.equals("net")||domain.equals("biz"))){
            throw new DomainException("DomainException: Invalid Domain");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String email=scan.nextLine();
        try{
            validateEmail(email);
            System.out.println("Valid email address");
        }catch(DotException | AtTheRateException | DomainException e){
            System.out.println(e.getMessage());
            System.out.println("Invalid email address");
        }
        scan.close();
    }
}
