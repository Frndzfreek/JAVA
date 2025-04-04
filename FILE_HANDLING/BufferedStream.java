import java.io.*;

//Buffered streams improve performance by reducing the number of direct I/O operations.

public class BufferedStreamExample {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

//Output: The content of input.txt will be printed line by line.
