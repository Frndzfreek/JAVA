package REGEX;
// You are using Java
import java.util.Scanner;
class StringProcessor {
    public String replaceExtraSpaces(String input) {
        return input.replaceAll("[\\s]+"," ");
    }
}
public class SpaceRegex {
    public static void main(String[] args) {
        //input entered with more than 2 white spaces
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();

        StringProcessor stringProcessor = new StringProcessor();
        String result = stringProcessor.replaceExtraSpaces(line);

        // Output the result
        System.out.println(result);
        input.close();
    }
}

