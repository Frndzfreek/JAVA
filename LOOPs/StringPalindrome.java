public class Main {
    public static void main(String[] args){
        String original="racecar";
        String reversed="";
        for (int i = original.length()-1 ;i>=0; i--){
            reversed+=original.charAt(i);
        }
        
        if(reversed.equals(original)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
