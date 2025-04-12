 import java.util.regex.*;

public class Main {
    public static void main(String[] args) {

        String input = "I love Java programming.";
        boolean found = Pattern.matches(".*Java.*", input);

        System.out.println("Contains 'Java'? " + found);
    }
}
