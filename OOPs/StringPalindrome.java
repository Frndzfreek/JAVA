import java.util.Scanner;
class Reverser{
    public String rev(String a){
        return new StringBuilder(a).reverse().toString();
    }
}
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String d=scan.nextLine().trim();
        Reverser obj=new Reverser();
        String j=obj.rev(d);
        if(j.equals(d)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not");
        }
    }
}
