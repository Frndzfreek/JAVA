import java.io.*;
public class CharacterStream{
//Character streams handle text files by reading and writing data in the form of characters.
	public static void main(String[] args) {
		try (FileWriter writer = new FileWriter("example.txt")) {
			writer.write("Hello, Java File Handling!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//Output: A file example.txt will be created containing Hello, Java File Handling!.
