package LOOPs;
import java.util.Scanner;
//CHECK AN INPUT IS A VOWEL OR A CONSONANT

public class consonent_or_vowel { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a character: "); 
        char ch = sc.next().charAt(0); 
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
            System.out.println(ch + " is a vowel."); 
            
        } else if (ch >= 'a' && ch <= 'z') { 
            System.out.println(ch + " is a consonant."); 
            
        } else { 
            System.out.println(ch + " is not an alphabetic character."); 
            
        } 
        sc.close(); 
    }
}
