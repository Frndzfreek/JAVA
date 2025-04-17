import java.io.*;
//Print streams enable formatted output.

public class PrintStreamEX {
	public static void main(String[] args) {
		try (PrintStream ps = new PrintStream("output.txt")) {
			ps.println("Hello, PrintStream!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//Output: A file output.txt will be created containing Hello, PrintStream!.
