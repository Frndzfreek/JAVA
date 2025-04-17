import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
