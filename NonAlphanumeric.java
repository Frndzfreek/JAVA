import java.util.Scanner;

public class NonAlphanumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String regex = "[^a-zA-Z0-9]";
        int count = input.replaceAll("[a-zA-Z0-9]", "").length();

        // Replace non-alphanumeric characters with '#'
        String modifiedString = input.replaceAll(regex, "#");

        System.out.println("Non-alphanumeric characters found and replaced: " + count);
        System.out.println("Modified string: " + modifiedString);

        sc.close();
    }
}