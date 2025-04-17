import java.io.*;

public class FileNotFoundExceptions {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
