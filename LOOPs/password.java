package LOOPS;
import java.util.Scanner;
public class password {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String correct="madhU";
        int attempts=3;

        while (attempts>0){
            System.out.print("enter: ");
            String input=scanner.nextLine();
            if(input.equals(correct)){
                System.out.println("success");
                return;
            }else{
                attempts--;
                if(attempts>0){
                    System.out.println(attempts+" u r inccorect");
                }else{
                    System.out.println("you are locked out");
                }
            }scanner.close();
        }
    }
}
