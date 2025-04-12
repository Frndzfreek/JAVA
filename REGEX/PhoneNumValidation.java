import java.util.regex.*;

public class PhoneNumberValidation {
    public static void main(String[] args) {

        String phone = "(123) 456-7890";
        boolean valid = phone.matches("^\\(\\d{3}\\) \\d{3}-\\d{4}$");

        System.out.println("Valid phone? " + valid);
    }
}
