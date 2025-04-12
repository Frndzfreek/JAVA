import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        String messy = "This   has   too    many spaces.";
        String clean = messy.replaceAll("\\s+", " ");

        System.out.println("Normalized: " + clean);
    }
}
