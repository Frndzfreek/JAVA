import java.util.regex.*;

public class EmailValidation {
    public static void main(String[] args) {

        String email = "test@example.com";

        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";

        boolean valid = Pattern.matches(regex, email);//provides boolean result

        System.out.println("Valid Email? " + valid);
    }
}
