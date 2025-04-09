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
//OR
import java.util.Scanner;
class Reverser{
    public String rev(String a){
        String b=a;
        String r="";
        for(int i=b.length()-1;i>=0;i--){
            r+=b.charAt(i);
        }
        return r;
    }
}
class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String d=scan.nextLine();
        Reverser obj=new Reverser();
        String j=obj.rev(d);
        if(j.equals(d)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not");
        }
    }
}
